package p432v8;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;

/* JADX INFO: renamed from: v8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9671d extends AbstractC9675h {

    /* JADX INFO: renamed from: a */
    public final long f49520a;

    /* JADX INFO: renamed from: b */
    public final Integer f49521b;

    /* JADX INFO: renamed from: c */
    public final long f49522c;

    /* JADX INFO: renamed from: d */
    public final byte[] f49523d;

    /* JADX INFO: renamed from: e */
    public final String f49524e;

    /* JADX INFO: renamed from: f */
    public final long f49525f;

    /* JADX INFO: renamed from: g */
    public final NetworkConnectionInfo f49526g;

    /* JADX INFO: renamed from: v8.d$a */
    public static final class a extends AbstractC9675h.a {

        /* JADX INFO: renamed from: a */
        public Long f49527a;

        /* JADX INFO: renamed from: b */
        public Integer f49528b;

        /* JADX INFO: renamed from: c */
        public Long f49529c;

        /* JADX INFO: renamed from: d */
        public byte[] f49530d;

        /* JADX INFO: renamed from: e */
        public String f49531e;

        /* JADX INFO: renamed from: f */
        public Long f49532f;

        /* JADX INFO: renamed from: g */
        public NetworkConnectionInfo f49533g;
    }

    public C9671d(long j10, Integer num, long j11, byte[] bArr, String str, long j12, NetworkConnectionInfo networkConnectionInfo) {
        this.f49520a = j10;
        this.f49521b = num;
        this.f49522c = j11;
        this.f49523d = bArr;
        this.f49524e = str;
        this.f49525f = j12;
        this.f49526g = networkConnectionInfo;
    }

    @Override // p432v8.AbstractC9675h
    /* JADX INFO: renamed from: a */
    public final Integer mo18169a() {
        return this.f49521b;
    }

    @Override // p432v8.AbstractC9675h
    /* JADX INFO: renamed from: b */
    public final long mo18170b() {
        return this.f49520a;
    }

    @Override // p432v8.AbstractC9675h
    /* JADX INFO: renamed from: c */
    public final long mo18171c() {
        return this.f49522c;
    }

    @Override // p432v8.AbstractC9675h
    /* JADX INFO: renamed from: d */
    public final NetworkConnectionInfo mo18172d() {
        return this.f49526g;
    }

    @Override // p432v8.AbstractC9675h
    /* JADX INFO: renamed from: e */
    public final byte[] mo18173e() {
        return this.f49523d;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        byte[] bArrMo18173e;
        String str;
        NetworkConnectionInfo networkConnectionInfo;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9675h)) {
            return false;
        }
        AbstractC9675h abstractC9675h = (AbstractC9675h) obj;
        if (this.f49520a == abstractC9675h.mo18170b()) {
            Integer num = this.f49521b;
            if (num == null) {
                if (abstractC9675h.mo18169a() == null) {
                    if (this.f49522c == abstractC9675h.mo18171c()) {
                        if (abstractC9675h instanceof C9671d) {
                            bArrMo18173e = ((C9671d) abstractC9675h).f49523d;
                        } else {
                            bArrMo18173e = abstractC9675h.mo18173e();
                        }
                        if (Arrays.equals(this.f49523d, bArrMo18173e)) {
                            str = this.f49524e;
                            if (str == null) {
                                if (abstractC9675h.mo18174f() == null) {
                                    if (this.f49525f == abstractC9675h.mo18175g()) {
                                        networkConnectionInfo = this.f49526g;
                                        if (networkConnectionInfo == null) {
                                            if (abstractC9675h.mo18172d() == null) {
                                                return true;
                                            }
                                        } else if (networkConnectionInfo.equals(abstractC9675h.mo18172d())) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (str.equals(abstractC9675h.mo18174f())) {
                                if (this.f49525f == abstractC9675h.mo18175g()) {
                                    networkConnectionInfo = this.f49526g;
                                    if (networkConnectionInfo == null) {
                                        if (abstractC9675h.mo18172d() == null) {
                                            return true;
                                        }
                                    } else if (networkConnectionInfo.equals(abstractC9675h.mo18172d())) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (num.equals(abstractC9675h.mo18169a())) {
                if (this.f49522c == abstractC9675h.mo18171c()) {
                    if (abstractC9675h instanceof C9671d) {
                        bArrMo18173e = ((C9671d) abstractC9675h).f49523d;
                    } else {
                        bArrMo18173e = abstractC9675h.mo18173e();
                    }
                    if (Arrays.equals(this.f49523d, bArrMo18173e)) {
                        str = this.f49524e;
                        if (str == null) {
                            if (abstractC9675h.mo18174f() == null) {
                                if (this.f49525f == abstractC9675h.mo18175g()) {
                                    networkConnectionInfo = this.f49526g;
                                    if (networkConnectionInfo == null) {
                                        if (abstractC9675h.mo18172d() == null) {
                                            return true;
                                        }
                                    } else if (networkConnectionInfo.equals(abstractC9675h.mo18172d())) {
                                        return true;
                                    }
                                }
                            }
                        } else if (str.equals(abstractC9675h.mo18174f())) {
                            if (this.f49525f == abstractC9675h.mo18175g()) {
                                networkConnectionInfo = this.f49526g;
                                if (networkConnectionInfo == null) {
                                    if (abstractC9675h.mo18172d() == null) {
                                        return true;
                                    }
                                } else if (networkConnectionInfo.equals(abstractC9675h.mo18172d())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p432v8.AbstractC9675h
    /* JADX INFO: renamed from: f */
    public final String mo18174f() {
        return this.f49524e;
    }

    @Override // p432v8.AbstractC9675h
    /* JADX INFO: renamed from: g */
    public final long mo18175g() {
        return this.f49525f;
    }

    public final int hashCode() {
        long j10 = this.f49520a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f49521b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j11 = this.f49522c;
        int iHashCode2 = (((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f49523d)) * 1000003;
        String str = this.f49524e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f49525f;
        int i11 = (iHashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f49526g;
        return i11 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f49520a + ", eventCode=" + this.f49521b + ", eventUptimeMs=" + this.f49522c + ", sourceExtension=" + Arrays.toString(this.f49523d) + ", sourceExtensionJsonProto3=" + this.f49524e + ", timezoneOffsetSeconds=" + this.f49525f + ", networkConnectionInfo=" + this.f49526g + "}";
    }
}
