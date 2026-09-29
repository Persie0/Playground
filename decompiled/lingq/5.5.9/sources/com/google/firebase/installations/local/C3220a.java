package com.google.firebase.installations.local;

import android.support.v4.media.session.C0166e;
import p003a2.C0009a;

/* JADX INFO: renamed from: com.google.firebase.installations.local.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3220a extends AbstractC3221b {

    /* JADX INFO: renamed from: b */
    public final String f16269b;

    /* JADX INFO: renamed from: c */
    public final PersistedInstallation.RegistrationStatus f16270c;

    /* JADX INFO: renamed from: d */
    public final String f16271d;

    /* JADX INFO: renamed from: e */
    public final String f16272e;

    /* JADX INFO: renamed from: f */
    public final long f16273f;

    /* JADX INFO: renamed from: g */
    public final long f16274g;

    /* JADX INFO: renamed from: h */
    public final String f16275h;

    /* JADX INFO: renamed from: com.google.firebase.installations.local.a$a */
    public static final class a extends AbstractC3221b.a {

        /* JADX INFO: renamed from: a */
        public String f16276a;

        /* JADX INFO: renamed from: b */
        public PersistedInstallation.RegistrationStatus f16277b;

        /* JADX INFO: renamed from: c */
        public String f16278c;

        /* JADX INFO: renamed from: d */
        public String f16279d;

        /* JADX INFO: renamed from: e */
        public Long f16280e;

        /* JADX INFO: renamed from: f */
        public Long f16281f;

        /* JADX INFO: renamed from: g */
        public String f16282g;

        public a() {
        }

        public a(AbstractC3221b abstractC3221b) {
            this.f16276a = abstractC3221b.mo9203c();
            this.f16277b = abstractC3221b.mo9206f();
            this.f16278c = abstractC3221b.mo9201a();
            this.f16279d = abstractC3221b.mo9205e();
            this.f16280e = Long.valueOf(abstractC3221b.mo9202b());
            this.f16281f = Long.valueOf(abstractC3221b.mo9207g());
            this.f16282g = abstractC3221b.mo9204d();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final C3220a m9209a() {
            String strM765k = this.f16277b == null ? " registrationStatus" : "";
            if (this.f16280e == null) {
                strM765k = strM765k.concat(" expiresInSecs");
            }
            if (this.f16281f == null) {
                strM765k = C0166e.m765k(strM765k, " tokenCreationEpochInSecs");
            }
            if (strM765k.isEmpty()) {
                return new C3220a(this.f16276a, this.f16277b, this.f16278c, this.f16279d, this.f16280e.longValue(), this.f16281f.longValue(), this.f16282g);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }

        /* JADX INFO: renamed from: b */
        public final a m9210b(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f16277b = registrationStatus;
            return this;
        }
    }

    public C3220a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j10, long j11, String str4) {
        this.f16269b = str;
        this.f16270c = registrationStatus;
        this.f16271d = str2;
        this.f16272e = str3;
        this.f16273f = j10;
        this.f16274g = j11;
        this.f16275h = str4;
    }

    @Override // com.google.firebase.installations.local.AbstractC3221b
    /* JADX INFO: renamed from: a */
    public final String mo9201a() {
        return this.f16271d;
    }

    @Override // com.google.firebase.installations.local.AbstractC3221b
    /* JADX INFO: renamed from: b */
    public final long mo9202b() {
        return this.f16273f;
    }

    @Override // com.google.firebase.installations.local.AbstractC3221b
    /* JADX INFO: renamed from: c */
    public final String mo9203c() {
        return this.f16269b;
    }

    @Override // com.google.firebase.installations.local.AbstractC3221b
    /* JADX INFO: renamed from: d */
    public final String mo9204d() {
        return this.f16275h;
    }

    @Override // com.google.firebase.installations.local.AbstractC3221b
    /* JADX INFO: renamed from: e */
    public final String mo9205e() {
        return this.f16272e;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3221b)) {
            return false;
        }
        AbstractC3221b abstractC3221b = (AbstractC3221b) obj;
        String str4 = this.f16269b;
        if (str4 == null) {
            if (abstractC3221b.mo9203c() == null) {
                if (this.f16270c.equals(abstractC3221b.mo9206f())) {
                    str = this.f16271d;
                    if (str == null) {
                        if (abstractC3221b.mo9201a() == null) {
                            str2 = this.f16272e;
                            if (str2 == null ? str2.equals(abstractC3221b.mo9205e()) : abstractC3221b.mo9205e() == null) {
                                if (this.f16273f == abstractC3221b.mo9202b() && this.f16274g == abstractC3221b.mo9207g()) {
                                    str3 = this.f16275h;
                                    if (str3 == null) {
                                        if (abstractC3221b.mo9204d() == null) {
                                            return true;
                                        }
                                    } else if (str3.equals(abstractC3221b.mo9204d())) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else if (str.equals(abstractC3221b.mo9201a())) {
                        str2 = this.f16272e;
                        if (str2 == null) {
                            if (this.f16273f == abstractC3221b.mo9202b()) {
                                str3 = this.f16275h;
                                if (str3 == null) {
                                    if (abstractC3221b.mo9204d() == null) {
                                        return true;
                                    }
                                } else if (str3.equals(abstractC3221b.mo9204d())) {
                                    return true;
                                }
                            }
                        } else if (this.f16273f == abstractC3221b.mo9202b()) {
                            str3 = this.f16275h;
                            if (str3 == null) {
                                if (abstractC3221b.mo9204d() == null) {
                                    return true;
                                }
                            } else if (str3.equals(abstractC3221b.mo9204d())) {
                                return true;
                            }
                        }
                    }
                }
            }
        } else if (str4.equals(abstractC3221b.mo9203c())) {
            if (this.f16270c.equals(abstractC3221b.mo9206f())) {
                str = this.f16271d;
                if (str == null) {
                    if (abstractC3221b.mo9201a() == null) {
                        str2 = this.f16272e;
                        if (str2 == null) {
                            if (this.f16273f == abstractC3221b.mo9202b()) {
                                str3 = this.f16275h;
                                if (str3 == null) {
                                    if (abstractC3221b.mo9204d() == null) {
                                        return true;
                                    }
                                } else if (str3.equals(abstractC3221b.mo9204d())) {
                                    return true;
                                }
                            }
                        } else if (this.f16273f == abstractC3221b.mo9202b()) {
                            str3 = this.f16275h;
                            if (str3 == null) {
                                if (abstractC3221b.mo9204d() == null) {
                                    return true;
                                }
                            } else if (str3.equals(abstractC3221b.mo9204d())) {
                                return true;
                            }
                        }
                    }
                } else if (str.equals(abstractC3221b.mo9201a())) {
                    str2 = this.f16272e;
                    if (str2 == null) {
                        if (this.f16273f == abstractC3221b.mo9202b()) {
                            str3 = this.f16275h;
                            if (str3 == null) {
                                if (abstractC3221b.mo9204d() == null) {
                                    return true;
                                }
                            } else if (str3.equals(abstractC3221b.mo9204d())) {
                                return true;
                            }
                        }
                    } else if (this.f16273f == abstractC3221b.mo9202b()) {
                        str3 = this.f16275h;
                        if (str3 == null) {
                            if (abstractC3221b.mo9204d() == null) {
                                return true;
                            }
                        } else if (str3.equals(abstractC3221b.mo9204d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.AbstractC3221b
    /* JADX INFO: renamed from: f */
    public final PersistedInstallation.RegistrationStatus mo9206f() {
        return this.f16270c;
    }

    @Override // com.google.firebase.installations.local.AbstractC3221b
    /* JADX INFO: renamed from: g */
    public final long mo9207g() {
        return this.f16274g;
    }

    /* JADX INFO: renamed from: h */
    public final a m9208h() {
        return new a(this);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f16269b;
        int iHashCode2 = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f16270c.hashCode()) * 1000003;
        String str2 = this.f16271d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16272e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f16273f;
        int i10 = (iHashCode4 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f16274g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f16275h;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return iHashCode ^ i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f16269b);
        sb2.append(", registrationStatus=");
        sb2.append(this.f16270c);
        sb2.append(", authToken=");
        sb2.append(this.f16271d);
        sb2.append(", refreshToken=");
        sb2.append(this.f16272e);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f16273f);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f16274g);
        sb2.append(", fisError=");
        return C0009a.m23l(sb2, this.f16275h, "}");
    }
}
