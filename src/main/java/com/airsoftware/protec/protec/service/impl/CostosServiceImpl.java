package com.airsoftware.protec.protec.service.impl;

import com.airsoftware.protec.protec.model.request.CostosDTO;
import com.airsoftware.protec.protec.model.request.GetCostosDTO;
import com.airsoftware.protec.protec.service.CostosService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
@Transactional
public class CostosServiceImpl implements CostosService{
    private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(CostosServiceImpl.class);

    @Value("http://201.161.41.142/wsRemoto2/")
    public String PROTEC_ENDPOINT;

    @Value("cmVtb3RvOnIzbTB0MCp2Mg==")
    public String PROTEC_SECRET;


    public Object asignarCostos(CostosDTO costosDTO){

        Object response1 = new Object();

        try{

            logger.info(PROTEC_SECRET);

            RestTemplate restTemplate = new RestTemplate();


            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic "+PROTEC_SECRET);
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
            map.add("idOt", ""+costosDTO.getIdOt()+"");
            map.add("idProveedor", ""+costosDTO.getIdProveedor()+"");
            map.add("idSubServicio", ""+costosDTO.getIdSubServicio()+"");
            map.add("idPlano", ""+costosDTO.getIdPlano()+"");
            map.add("tipoServicio", ""+costosDTO.getTipoServicio()+"");
            map.add("idRvt", ""+costosDTO.getIdRvt()+"");
            map.add("ip", ""+costosDTO.getIp()+"");
            map.add("costoReal", ""+costosDTO.getCostoReal()+"");
            map.add("iva", ""+costosDTO.getIva()+"");
            map.add("retencion", ""+costosDTO.getRetencion()+"");
            map.add("total", ""+costosDTO.getTotal()+"");
            map.add("c1", ""+costosDTO.getC1()+"");
            map.add("c2", ""+costosDTO.getC2()+"");
            map.add("c3", ""+costosDTO.getC3()+"");
            map.add("c4", ""+costosDTO.getC4()+"");
            map.add("c5", ""+costosDTO.getC5()+"");
            map.add("c6", ""+costosDTO.getC6()+"");
            map.add("costoVariable", ""+costosDTO.getCostoVariable()+"");

            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

            ResponseEntity<Object> response = restTemplate.postForEntity( PROTEC_ENDPOINT + "asignarCostos/", request , Object.class );


            System.out.println(response.getBody().toString());

            response1 = response.getBody();

        }catch(Exception ex) {
            logger.error("Error al consultar el ws protec.", ex);
        }

        return response1;
    }

    public Object obtenerCostos(GetCostosDTO getCostosDTO){
        Object response1 = new Object();

        try{

            logger.info(PROTEC_SECRET);

            RestTemplate restTemplate = new RestTemplate();


            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic "+PROTEC_SECRET);
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
            map.add("idProveedor", ""+getCostosDTO.getIdProveedor()+"");
            map.add("idSubServicio", ""+getCostosDTO.getIdSubServicio()+"");
            map.add("kilometros", ""+getCostosDTO.getKilometros()+"");

            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

            ResponseEntity<Object> response = restTemplate.postForEntity( PROTEC_ENDPOINT + "obtenerCostos/", request , Object.class );


            System.out.println(response.getBody().toString());

            response1 = response.getBody();

        }catch(Exception ex) {
            logger.error("Error al consultar el ws protec.", ex);
        }

        return response1;
    }

    public Object obtenerCostosPorPlano(GetCostosDTO getCostosDTO){
        Object response1 = new Object();

        try{

            logger.info(PROTEC_SECRET);

            RestTemplate restTemplate = new RestTemplate();


            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic "+PROTEC_SECRET);
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
            map.add("idProveedor", ""+getCostosDTO.getIdProveedor()+"");
            map.add("idSubServicio", ""+getCostosDTO.getIdSubServicio()+"");
            map.add("idPlano", ""+getCostosDTO.getIdPlano()+"");

            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

            ResponseEntity<Object> response = restTemplate.postForEntity( PROTEC_ENDPOINT + "obtenerCostosPorPlano/", request , Object.class );


            System.out.println(response.getBody().toString());

            response1 = response.getBody();

        }catch(Exception ex) {
            logger.error("Error al consultar el ws protec.", ex);
        }

        return response1;
    }
}
