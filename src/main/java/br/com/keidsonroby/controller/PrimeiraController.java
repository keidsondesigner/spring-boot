package br.com.keidsonroby.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiroController")
public class PrimeiraController {

  @GetMapping("/primeiroMetodo/{id}")
  // public String primeroMetodo(@PathVariable(name = "id") String id) {
  // posso renomear o nome do parametro usando name
  public String primeroMetodo(@PathVariable String id) {
    return "O parametro é " + id;
  }

  // Query params
  @GetMapping("/metodoComQueryParams")
  // vou receber o id(parametro) na url da requisação;
  public String metodoComQueryParams(@RequestParam String id){
    return "O parametro com metodoComQueryParans é " + id;
  }

  @GetMapping("/metodoComQueryParams2")
  // agrupando todos os parametos passado na url em um array
  public String metodoComQueryParams2(@RequestParam Map<String, String> allParams){
    return "O parametro com metodoComQueryParans é " + allParams.entrySet();
  }

  @PostMapping("/metodoBodyParams")
  // vou receber o meus dados no body da requisação;
  public String metodoBodyParams(@RequestBody String username) {
    return "metodoBodyParams" + username;
  }

  // Headers params
  @PostMapping("/metodoHeadersParams")
  // vou receber o meus dados no headers da requisação;
  public String metodoHeadersParams(@RequestHeader("name") String name) {
    return "metodoHeadersParams" + name;
  }

  // recebo um array de dados no headers
  @PostMapping("/metodoHeadersParams2")
  // vou receber o meus dados no headers da requisação;
  public String metodoHeadersParams2(@RequestHeader Map<String, String> headers) {
    return "metodoHeadersParams" + headers.entrySet();
  }
}
