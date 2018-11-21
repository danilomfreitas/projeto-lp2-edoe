package validacao;

import java.util.Arrays;
import java.util.List;

/**
* Representacao de um validador das classes bases.
*
* @author Antonio Bertino de Vasconcelos Cabral Neto
* @author Arthur Silva Lima Guedes
* @author Danilo de Menezes Freitas
* @author Talita Galdino Gouveia
*/
public class ValidadorBase {
	
	/**
	 * Metodo auxiliar que verifica se o parametro nome e nulo ou vazio, caso seja, esse metodo lancara uma excecao
	 * @param nome representa o nome do usuario
	 */
	public void validaNome(String nome) {
		if (nome == null || nome.trim().equals("")) {
			throw new IllegalArgumentException("Entrada invalida: nome nao pode ser vazio ou nulo.");
		}
	}
	
	private void validaEmail(String email) {
		if (email == null || email.trim().equals("")) {
			throw new IllegalArgumentException("Entrada invalida: email nao pode ser vazio ou nulo.");
		}
	}
	
	private void validaCelular(String celular) {
		if (celular == null || celular.trim().equals("")) {
			throw new IllegalArgumentException("Entrada invalida: celular nao pode ser vazio ou nulo.");
		}
	}
	
	private void validaClasse(String classe) {
		if (classe == null || classe.trim().equals("")) {
            throw new IllegalArgumentException("Entrada invalida: classe nao pode ser vazia ou nula.");
        }

        // Classes validas para cadastro.
        final String[] classesValidas = {"PESSOA_FISICA", "IGREJA", "ORGAO_PUBLICO_MUNICIPAL", "ORGAO_PUBLICO_ESTADUAL", "ORGAO_PUBLICO_FEDERAL", "ONG", "ASSOCIACAO", "SOCIEDADE"};
		final List<String>  classesValidasList = Arrays.asList(classesValidas);

		if (!classesValidasList.contains(classe)) {
			throw new IllegalArgumentException("Entrada invalida: opcao de classe invalida.");
		}
	}
	
	/**
	 * Metodo auxiliar que verifica se o parametro id e nulo ou vazio, caso seja, esse metodo lancara uma excecao
	 * @param id representa a id do usuario
	 */
	public void validaId(String id) {
		if (id == null || id.trim().equals("")) {
			throw new IllegalArgumentException("Entrada invalida: id do usuario nao pode ser vazio ou nulo.");
		}
	}
	
	/**
	* Metodo auxiliar que valida os parametros passados para a construcao do usuario.
	* 
	* @param id a identificacao do usuario
	* @param nome o nome do usuario
	* @param email o email do usuario
	* @param celular o numero do celular do usuario
	* @param classe a classe do usuario
	*/
	public void validaUsuario(String id, String nome, String email, String celular, String classe) {
		validaId(id);
		validaNome(nome);
		validaEmail(email);
		validaCelular(celular);
		validaClasse(classe);
	}
}
