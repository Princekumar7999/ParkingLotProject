package com.example.parkinglot.dtos;

import com.example.parkinglot.models.Ticket;
import sun.security.provider.certpath.OCSPResponse;

public class IssueTicketResponseDto {
    private Ticket ticket;
    private OCSPResponse.ResponseStatus responseStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public OCSPResponse.ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(OCSPResponse.ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}