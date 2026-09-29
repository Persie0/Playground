package com.google.firebase.installations.remote;

/* JADX INFO: renamed from: com.google.firebase.installations.remote.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3222a extends InstallationResponse {

    /* JADX INFO: renamed from: a */
    public final String f16286a;

    /* JADX INFO: renamed from: b */
    public final String f16287b;

    /* JADX INFO: renamed from: c */
    public final String f16288c;

    /* JADX INFO: renamed from: d */
    public final TokenResult f16289d;

    /* JADX INFO: renamed from: e */
    public final InstallationResponse.ResponseCode f16290e;

    public C3222a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f16286a = str;
        this.f16287b = str2;
        this.f16288c = str3;
        this.f16289d = tokenResult;
        this.f16290e = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    /* JADX INFO: renamed from: a */
    public final TokenResult mo9211a() {
        return this.f16289d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    /* JADX INFO: renamed from: b */
    public final String mo9212b() {
        return this.f16287b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    /* JADX INFO: renamed from: c */
    public final String mo9213c() {
        return this.f16288c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    /* JADX INFO: renamed from: d */
    public final InstallationResponse.ResponseCode mo9214d() {
        return this.f16290e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    /* JADX INFO: renamed from: e */
    public final String mo9215e() {
        return this.f16286a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        String str;
        String str2;
        TokenResult tokenResult;
        InstallationResponse.ResponseCode responseCode;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str3 = this.f16286a;
        if (str3 == null) {
            if (installationResponse.mo9215e() == null) {
                str = this.f16287b;
                if (str == null) {
                    if (installationResponse.mo9212b() == null) {
                        str2 = this.f16288c;
                        if (str2 == null ? str2.equals(installationResponse.mo9213c()) : installationResponse.mo9213c() == null) {
                            tokenResult = this.f16289d;
                            if (tokenResult == null) {
                                if (installationResponse.mo9211a() == null) {
                                    responseCode = this.f16290e;
                                    if (responseCode == null) {
                                        if (installationResponse.mo9214d() == null) {
                                            return true;
                                        }
                                    } else if (responseCode.equals(installationResponse.mo9214d())) {
                                        return true;
                                    }
                                }
                            } else if (tokenResult.equals(installationResponse.mo9211a())) {
                                responseCode = this.f16290e;
                                if (responseCode == null) {
                                    if (installationResponse.mo9214d() == null) {
                                        return true;
                                    }
                                } else if (responseCode.equals(installationResponse.mo9214d())) {
                                    return true;
                                }
                            }
                        }
                    }
                } else if (str.equals(installationResponse.mo9212b())) {
                    str2 = this.f16288c;
                    if (str2 == null) {
                        tokenResult = this.f16289d;
                        if (tokenResult == null) {
                            if (installationResponse.mo9211a() == null) {
                                responseCode = this.f16290e;
                                if (responseCode == null) {
                                    if (installationResponse.mo9214d() == null) {
                                        return true;
                                    }
                                } else if (responseCode.equals(installationResponse.mo9214d())) {
                                    return true;
                                }
                            }
                        } else if (tokenResult.equals(installationResponse.mo9211a())) {
                            responseCode = this.f16290e;
                            if (responseCode == null) {
                                if (installationResponse.mo9214d() == null) {
                                    return true;
                                }
                            } else if (responseCode.equals(installationResponse.mo9214d())) {
                                return true;
                            }
                        }
                    } else {
                        tokenResult = this.f16289d;
                        if (tokenResult == null) {
                            if (installationResponse.mo9211a() == null) {
                                responseCode = this.f16290e;
                                if (responseCode == null) {
                                    if (installationResponse.mo9214d() == null) {
                                        return true;
                                    }
                                } else if (responseCode.equals(installationResponse.mo9214d())) {
                                    return true;
                                }
                            }
                        } else if (tokenResult.equals(installationResponse.mo9211a())) {
                            responseCode = this.f16290e;
                            if (responseCode == null) {
                                if (installationResponse.mo9214d() == null) {
                                    return true;
                                }
                            } else if (responseCode.equals(installationResponse.mo9214d())) {
                                return true;
                            }
                        }
                    }
                }
            }
        } else if (str3.equals(installationResponse.mo9215e())) {
            str = this.f16287b;
            if (str == null) {
                if (installationResponse.mo9212b() == null) {
                    str2 = this.f16288c;
                    if (str2 == null) {
                        tokenResult = this.f16289d;
                        if (tokenResult == null) {
                            if (installationResponse.mo9211a() == null) {
                                responseCode = this.f16290e;
                                if (responseCode == null) {
                                    if (installationResponse.mo9214d() == null) {
                                        return true;
                                    }
                                } else if (responseCode.equals(installationResponse.mo9214d())) {
                                    return true;
                                }
                            }
                        } else if (tokenResult.equals(installationResponse.mo9211a())) {
                            responseCode = this.f16290e;
                            if (responseCode == null) {
                                if (installationResponse.mo9214d() == null) {
                                    return true;
                                }
                            } else if (responseCode.equals(installationResponse.mo9214d())) {
                                return true;
                            }
                        }
                    } else {
                        tokenResult = this.f16289d;
                        if (tokenResult == null) {
                            if (installationResponse.mo9211a() == null) {
                                responseCode = this.f16290e;
                                if (responseCode == null) {
                                    if (installationResponse.mo9214d() == null) {
                                        return true;
                                    }
                                } else if (responseCode.equals(installationResponse.mo9214d())) {
                                    return true;
                                }
                            }
                        } else if (tokenResult.equals(installationResponse.mo9211a())) {
                            responseCode = this.f16290e;
                            if (responseCode == null) {
                                if (installationResponse.mo9214d() == null) {
                                    return true;
                                }
                            } else if (responseCode.equals(installationResponse.mo9214d())) {
                                return true;
                            }
                        }
                    }
                }
            } else if (str.equals(installationResponse.mo9212b())) {
                str2 = this.f16288c;
                if (str2 == null) {
                    tokenResult = this.f16289d;
                    if (tokenResult == null) {
                        if (installationResponse.mo9211a() == null) {
                            responseCode = this.f16290e;
                            if (responseCode == null) {
                                if (installationResponse.mo9214d() == null) {
                                    return true;
                                }
                            } else if (responseCode.equals(installationResponse.mo9214d())) {
                                return true;
                            }
                        }
                    } else if (tokenResult.equals(installationResponse.mo9211a())) {
                        responseCode = this.f16290e;
                        if (responseCode == null) {
                            if (installationResponse.mo9214d() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.mo9214d())) {
                            return true;
                        }
                    }
                } else {
                    tokenResult = this.f16289d;
                    if (tokenResult == null) {
                        if (installationResponse.mo9211a() == null) {
                            responseCode = this.f16290e;
                            if (responseCode == null) {
                                if (installationResponse.mo9214d() == null) {
                                    return true;
                                }
                            } else if (responseCode.equals(installationResponse.mo9214d())) {
                                return true;
                            }
                        }
                    } else if (tokenResult.equals(installationResponse.mo9211a())) {
                        responseCode = this.f16290e;
                        if (responseCode == null) {
                            if (installationResponse.mo9214d() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.mo9214d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f16286a;
        int iHashCode2 = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f16287b;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16288c;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f16289d;
        int iHashCode5 = (iHashCode4 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f16290e;
        if (responseCode != null) {
            iHashCode = responseCode.hashCode();
        }
        return iHashCode ^ iHashCode5;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f16286a + ", fid=" + this.f16287b + ", refreshToken=" + this.f16288c + ", authToken=" + this.f16289d + ", responseCode=" + this.f16290e + "}";
    }
}
