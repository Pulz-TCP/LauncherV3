package net.technicpack.minecraftcore.msa.auth.response;

public class LiveDeviceAuthenticateResponse {
    private String IssueInstant;
    private String NotAfter;
    private String Token;
    private XboxDisplayClaims DisplayClaims;

    public LiveDeviceAuthenticateResponse() {
    }

    public String getToken() { return Token; }
}
