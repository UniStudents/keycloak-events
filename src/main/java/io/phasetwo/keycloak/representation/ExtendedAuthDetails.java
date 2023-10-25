package io.phasetwo.keycloak.representation;

import org.keycloak.events.admin.AuthDetails;

/** Extension of the {@link AuthDetails} for adding the agent username */
public class ExtendedAuthDetails extends AuthDetails {

  private String username;
  private String sessionId;

  private String firstName;

  private String lastName;

  public ExtendedAuthDetails(AuthDetails authDetails) {
    if (authDetails != null) {
      setClientId(authDetails.getClientId());
      setIpAddress(authDetails.getIpAddress());
      setRealmId(authDetails.getRealmId());
      setUserId(authDetails.getUserId());
    }
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public String getSessionId() {
    return sessionId;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

}
