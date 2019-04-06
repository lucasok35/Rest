package br.com.rest.teste;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json")
public class JSONPessoa {
	
	@GET
	@Path("/get")
	@Produces("application/json")
	public Pessoa getProductInJSON() {
		
		Pessoa p = new Pessoa();
		p.setCodigo(1);
		p.setNome("Jose Silva");
		
		return p;
	}
	
	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createPessoaInJSON(Pessoa pessoa) {
		
		String result = "Product created : " + pessoa;
		return Response.status(201).entity(result).build();
	}

}
