package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.location;

public interface LocationService {
    location addLocation(location location);
    location getLocationById(Integer locationId);
    location updateLocation(Integer locationId, location updatedLocation);
    void deleteLocation(Integer locationId);
}
