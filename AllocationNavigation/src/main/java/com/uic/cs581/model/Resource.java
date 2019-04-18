package com.uic.cs581.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter
public class Resource {
    private int resourceId;
    private String pickUpH3Index;           //provided by the Uber H3 Api
    private String dropOffH3Index;          //provided by the Uber H3 Api
    private String pickUpLat;
    private String pickUpLong;
    private String dropOffLat;
    private String dropOffLong;
    private int cabId;
    private long expirationTimeLeftInMillis;
    private long pickupSimTimeInMillis;     // based on the simulation clock
    private long dropOffSimTimeInMillis;    // based on the simulation clock
    private long requestTimeInMillis;    // 10 minutes before pickup time
    private long pickupTimeInMillis;        // provided in the data at runtime
    private long dropOffTimeInMillis;       // provided in the data at runtime

    public static final long EXPIRATION_TIME_MILLIS = 600000;     //max life time of the resource
}
