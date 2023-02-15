package com.ncl.team3.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * This class is to respond the request from front end
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CastleOrderInfoResponse {

    private String castleName;

    private Integer guestNumber;

    private String castleTicketType;

    private String castleTicketTravelDate;

    private String castleTicketTravelTime;
}