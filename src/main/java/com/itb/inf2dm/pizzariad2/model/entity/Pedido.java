package com.itb.inf2dm.pizzariad2.model.entity;

import java.time.LocalDateTime;

public class Pedido {

    private long id;
    private double valorPedido;
    private LocalDateTime dataHoraPedido;
    private LocalDateTime dataHoraEntrega;
    private String status;
    private boolean codStatus;

}
