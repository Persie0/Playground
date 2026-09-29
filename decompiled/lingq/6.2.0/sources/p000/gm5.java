package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.gps.ara.C0923a;
import com.facebook.appevents.gps.topics.AbstractC0924a;
import com.facebook.appevents.integrity.C0925a;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.abt.component.AbtRegistrar;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gm5 implements zc1, k13, yj7, li4, InterfaceC3698vu {

    /* JADX INFO: renamed from: b */
    public static final gm5 f41008b = new gm5(0);

    /* JADX INFO: renamed from: c */
    public static final gm5 f41009c = new gm5(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41010a;

    public /* synthetic */ gm5(int i) {
        this.f41010a = i;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m12750e() {
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m12751g(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    /* JADX INFO: renamed from: a */
    public List m12752a(String str, boolean z, boolean z2) {
        return au5.m3055f(str, z, z2);
    }

    @Override // p000.InterfaceC3698vu
    /* JADX INFO: renamed from: b */
    public int mo12753b(int i, LayoutDirection layoutDirection) {
        switch (this.f41010a) {
            case 28:
                return Math.round((1.0f + (layoutDirection == LayoutDirection.Ltr ? -1.0f : 1.0f)) * (i / 2.0f));
            default:
                return Math.round((1.0f + 0.0f) * ((i + 0) / 2.0f));
        }
    }

    @Override // p000.yj7
    /* JADX INFO: renamed from: c */
    public Object mo12754c(lda ldaVar) {
        return new x11();
    }

    @Override // p000.li4
    /* JADX INFO: renamed from: d */
    public lda mo12755d(co7 co7Var) throws GeneralSecurityException {
        int i = 4;
        boolean z = false;
        switch (this.f41010a) {
            case 7:
                if (!((String) co7Var.f10359b).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    C3386nv.m17626m("Wrong type URL in call to AesCmacParameters.parseParameters");
                    return null;
                }
                try {
                    C3677v9 c3677v9M23181D = C3677v9.m23181D((ByteString) co7Var.f10361d, ox2.m18561a());
                    if (c3677v9M23181D.m23187B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    gv5 gv5Var = new gv5(5);
                    gv5Var.m12888R(c3677v9M23181D.m23188z().size());
                    gv5Var.m12896Z(c3677v9M23181D.m23186A().m13152x());
                    gv5Var.m12899b0(AbstractC3140ja.m14360a((OutputPrefixType) co7Var.f10363f));
                    C2957ea c2957eaM12907o = gv5Var.m12907o();
                    gv5 gv5Var2 = new gv5(i, z);
                    gv5Var2.m12890T(c2957eaM12907o);
                    gv5Var2.m12882L(new or3(yk0.m25164a(c3677v9M23181D.m23188z().m6412j())));
                    gv5Var2.m12886P((Integer) co7Var.f10364g);
                    return gv5Var2.m12906n();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                    v63.m23147y("Parsing AesCmacKey failed");
                    return null;
                }
            case 8:
                if (!((String) co7Var.f10359b).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    C3386nv.m17626m("Wrong type URL in call to AesEaxParameters.parseParameters");
                    return null;
                }
                try {
                    C3069hb c3069hbM13172D = C3069hb.m13172D((ByteString) co7Var.f10361d, ox2.m18561a());
                    if (c3069hbM13172D.m13178B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C3329mb c3329mb = new C3329mb(0);
                    c3329mb.m16731h(c3069hbM13172D.m13179z().size());
                    int iM20562x = c3069hbM13172D.m13177A().m20562x();
                    if (iM20562x != 12 && iM20562x != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iM20562x)));
                    }
                    c3329mb.f50861c = Integer.valueOf(iM20562x);
                    c3329mb.f50862d = 16;
                    c3329mb.f50863e = AbstractC3605tb.m21930a((OutputPrefixType) co7Var.f10363f);
                    C3403ob c3403obM16724a = c3329mb.m16724a();
                    gv5 gv5Var3 = new gv5(6, z);
                    gv5Var3.m12891U(c3403obM16724a);
                    gv5Var3.m12887Q(new or3(yk0.m25164a(c3069hbM13172D.m13179z().m6412j())));
                    gv5Var3.m12886P((Integer) co7Var.f10364g);
                    return gv5Var3.m12908p();
                } catch (InvalidProtocolBufferException unused2) {
                    v63.m23147y("Parsing AesEaxcKey failed");
                    return null;
                }
            case 9:
                if (!((String) co7Var.f10359b).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    C3386nv.m17626m("Wrong type URL in call to AesGcmParameters.parseParameters");
                    return null;
                }
                try {
                    C3753xb c3753xbM24433A = C3753xb.m24433A((ByteString) co7Var.f10361d, ox2.m18561a());
                    if (c3753xbM24433A.m24438y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int size = c3753xbM24433A.m24437x().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    C2923dc c2923dc = new C2923dc(size, 12, 16, AbstractC2996fc.m11761a((OutputPrefixType) co7Var.f10363f));
                    C3309ls c3309ls = new C3309ls(i, z);
                    c3309ls.f50065c = null;
                    c3309ls.f50066d = null;
                    c3309ls.f50064b = c2923dc;
                    c3309ls.f50065c = new or3(yk0.m25164a(c3753xbM24433A.m24437x().m6412j()));
                    c3309ls.f50066d = (Integer) co7Var.f10364g;
                    return c3309ls.m16505b();
                } catch (InvalidProtocolBufferException unused3) {
                    v63.m23147y("Parsing AesGcmKey failed");
                    return null;
                }
            default:
                if (!((String) co7Var.f10359b).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    C3386nv.m17626m("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                    return null;
                }
                try {
                    C3142jc c3142jcM14383B = C3142jc.m14383B((ByteString) co7Var.f10361d, ox2.m18561a());
                    if (c3142jcM14383B.m14388z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C3156jq c3156jq = new C3156jq(2);
                    c3156jq.m14599M(c3142jcM14383B.m14387y().size());
                    c3156jq.m14605S(AbstractC3530rc.m20578a((OutputPrefixType) co7Var.f10363f));
                    C3455pc c3455pcM14608s = c3156jq.m14608s();
                    gv5 gv5Var4 = new gv5(7, z);
                    gv5Var4.m12892V(c3455pcM14608s);
                    gv5Var4.m12887Q(new or3(yk0.m25164a(c3142jcM14383B.m14387y().m6412j())));
                    gv5Var4.m12886P((Integer) co7Var.f10364g);
                    return gv5Var4.m12910r();
                } catch (InvalidProtocolBufferException unused4) {
                    v63.m23147y("Parsing AesGcmSivKey failed");
                    return null;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.k13
    /* JADX INFO: renamed from: f */
    public void mo12756f(boolean z) {
        HashSet hashSet;
        HashSet hashSetM3915D;
        Object[] objArr = 0;
        switch (this.f41010a) {
            case 5:
                if (z) {
                    t41 t41Var = t41.f61839a;
                    if (!lp1.f49971a.contains(t41.class)) {
                        try {
                            t41.f61844f.set(true);
                        } catch (Throwable th) {
                            lp1.m16420a(t41.class, th);
                            return;
                        }
                        break;
                    }
                } else {
                    t41 t41Var2 = t41.f61839a;
                    if (!lp1.f49971a.contains(t41.class)) {
                        try {
                            t41.f61844f.set(false);
                        } catch (Throwable th2) {
                            lp1.m16420a(t41.class, th2);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                if (z) {
                    st2 st2Var = st2.f61382a;
                    if (!lp1.f49971a.contains(st2.class)) {
                        try {
                            st2.f61383b = true;
                            st2.f61382a.m21736a();
                        } catch (Throwable th3) {
                            lp1.m16420a(st2.class, th3);
                        }
                        break;
                    }
                }
                break;
            case 12:
                if (z) {
                    iy5 iy5Var = iy5.f44766b;
                    if (!lp1.f49971a.contains(iy5.class)) {
                        try {
                            try {
                                sy2.m21768c().execute(new RunnableC3637u6(7));
                            } catch (Exception unused) {
                                sy2 sy2Var = sy2.f61585a;
                                return;
                            }
                        } catch (Throwable th4) {
                            lp1.m16420a(iy5.class, th4);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 13:
                if (z) {
                    i80 i80Var = i80.f43673a;
                    Set set = lp1.f49971a;
                    if (!set.contains(i80.class)) {
                        try {
                            if (!i80.f43674b) {
                                i80 i80Var2 = i80.f43673a;
                                if (!set.contains(i80Var2)) {
                                    try {
                                        w23 w23VarM24862k = y23.m24862k(sy2.m21767b(), false);
                                        if (w23VarM24862k != null) {
                                            JSONArray jSONArray = w23VarM24862k.f66270s;
                                            HashSet hashSet2 = null;
                                            if (!set.contains(i80Var2)) {
                                                try {
                                                    try {
                                                        hashSet = bna.m3915D(jSONArray);
                                                        if (hashSet == null) {
                                                            hashSet = new HashSet();
                                                        }
                                                    } catch (Exception unused2) {
                                                        hashSet = new HashSet();
                                                    }
                                                    hashSet2 = hashSet;
                                                } catch (Throwable th5) {
                                                    lp1.m16420a(i80Var2, th5);
                                                }
                                            }
                                            i80.f43675c = hashSet2;
                                            break;
                                        }
                                    } catch (Throwable th6) {
                                        lp1.m16420a(i80Var2, th6);
                                    }
                                }
                                i80.f43674b = !i80.f43675c.isEmpty();
                            }
                        } catch (Throwable th7) {
                            lp1.m16420a(i80.class, th7);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 14:
                if (z) {
                    z24 z24Var = z24.f70782a;
                    if (!lp1.f49971a.contains(z24.class)) {
                        try {
                            if (c60.m4339c()) {
                                z24.f70786e.set(true);
                                z24.m25417d();
                            } else {
                                x24.m24244m();
                            }
                        } catch (Throwable th8) {
                            lp1.m16420a(z24.class, th8);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 15:
                if (z) {
                    ri9 ri9Var = ri9.f59370a;
                    Set set2 = lp1.f49971a;
                    if (!set2.contains(ri9.class)) {
                        try {
                            if (!ri9.f59371b) {
                                ri9 ri9Var2 = ri9.f59370a;
                                if (!set2.contains(ri9Var2)) {
                                    try {
                                        w23 w23VarM24862k2 = y23.m24862k(sy2.m21767b(), false);
                                        if (w23VarM24862k2 != null) {
                                            ri9Var2.m20669a(w23VarM24862k2.f66269r);
                                            break;
                                        }
                                    } catch (Throwable th9) {
                                        lp1.m16420a(ri9Var2, th9);
                                    }
                                }
                                ri9.f59371b = (ri9.f59372c.isEmpty() && ri9.f59373d.isEmpty()) ? false : true;
                            }
                        } catch (Throwable th10) {
                            lp1.m16420a(ri9.class, th10);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 16:
                if (z) {
                    C0925a c0925a = C0925a.f11404a;
                    if (!lp1.f49971a.contains(C0925a.class)) {
                        try {
                            C0925a.f11405b = true;
                            C0925a.f11404a.m5192a();
                        } catch (Throwable th11) {
                            lp1.m16420a(C0925a.class, th11);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 17:
                if (z) {
                    Set set3 = lp1.f49971a;
                    if (!set3.contains(ho5.class)) {
                        try {
                            ho5 ho5Var = ho5.f42698b;
                            if (!set3.contains(ho5Var)) {
                                try {
                                    w23 w23VarM24862k3 = y23.m24862k(sy2.m21767b(), false);
                                    if (w23VarM24862k3 != null) {
                                        ho5.f42700d = w23VarM24862k3.f66265n;
                                        break;
                                    }
                                } catch (Throwable th12) {
                                    lp1.m16420a(ho5Var, th12);
                                }
                            }
                            if (ho5.f42700d != null) {
                                ho5.f42699c = true;
                            }
                        } catch (Throwable th13) {
                            lp1.m16420a(ho5.class, th13);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 18:
                if (z) {
                    xd0 xd0Var = xd0.f68087a;
                    Set set4 = lp1.f49971a;
                    if (!set4.contains(xd0.class)) {
                        try {
                            xd0 xd0Var2 = xd0.f68087a;
                            if (!set4.contains(xd0Var2)) {
                                try {
                                    w23 w23VarM24862k4 = y23.m24862k(sy2.m21767b(), false);
                                    if (w23VarM24862k4 != null && (hashSetM3915D = bna.m3915D(w23VarM24862k4.f66266o)) != null) {
                                        xd0.f68089c = hashSetM3915D;
                                    }
                                } catch (Throwable th14) {
                                    lp1.m16420a(xd0Var2, th14);
                                }
                            }
                            HashSet hashSet3 = xd0.f68089c;
                            if (hashSet3 != null && !hashSet3.isEmpty()) {
                                xd0.f68088b = true;
                            }
                        } catch (Throwable th15) {
                            lp1.m16420a(xd0.class, th15);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 19:
                if (z) {
                    r38 r38Var = r38.f58558a;
                    if (!lp1.f49971a.contains(r38.class)) {
                        try {
                            r38.f58558a.m20279a();
                            if (!r38.f58560c.isEmpty()) {
                                r38.f58559b = true;
                            }
                        } catch (Throwable th16) {
                            lp1.m16420a(r38.class, th16);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 20:
                if (z) {
                    aw8 aw8Var = aw8.f7620a;
                    if (!lp1.f49971a.contains(aw8.class)) {
                        try {
                            aw8.f7620a.m3099a();
                            if (aw8.f7622c.isEmpty() && aw8.f7623d.isEmpty()) {
                                aw8.f7621b = false;
                            } else {
                                aw8.f7621b = true;
                            }
                        } catch (Throwable th17) {
                            lp1.m16420a(aw8.class, th17);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 21:
                if (z) {
                    int i = AbstractC3489q9.f57405B;
                    try {
                        mp3 mp3Var = new mp3(null, sy2.m21767b().concat("/cloudbridge_settings"), null, HttpMethod.GET, new C3732wr(objArr == true ? 1 : 0));
                        iy5 iy5Var2 = qj5.f57852d;
                        iy5.m14198n(LoggingBehavior.APP_EVENTS, "q9", " \n\nCreating Graph Request: \n=============\n%s\n\n ", mp3Var);
                        mp3Var.m16983d();
                    } catch (JSONException e) {
                        iy5 iy5Var3 = qj5.f57852d;
                        iy5.m14198n(LoggingBehavior.APP_EVENTS, "q9", " \n\nGraph Request Exception: \n=============\n%s\n\n ", lda.m16112L(e));
                        return;
                    }
                }
                break;
            case 22:
                if (z) {
                    C0923a c0923a = C0923a.f11395a;
                    if (!lp1.f49971a.contains(C0923a.class)) {
                        try {
                            C0923a.f11397c = true;
                            C0923a.f11398d = new zo3(sy2.m21766a());
                            C0923a.f11399e = "https://www." + sy2.f61603s + "/privacy_sandbox/mobile/register/trigger";
                        } catch (Throwable th18) {
                            lp1.m16420a(C0923a.class, th18);
                            return;
                        }
                        break;
                    }
                }
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                if (z) {
                    f17.m11496a();
                }
                break;
            case 24:
                if (z) {
                    AbstractC0924a.m5190a();
                }
                break;
            case 25:
                if (z) {
                    p88 p88Var = p88.f55757a;
                    if (!lp1.f49971a.contains(p88.class)) {
                        try {
                            p88.f55758b = true;
                            p88.f55757a.m18976b();
                        } catch (Throwable th19) {
                            lp1.m16420a(p88.class, th19);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 26:
                if (z) {
                    y06 y06Var = y06.f69052a;
                    if (!lp1.f49971a.contains(y06.class)) {
                        try {
                            try {
                                sy2.m21768c().execute(new RunnableC3637u6(8));
                            } catch (Exception unused3) {
                                return;
                            }
                        } catch (Throwable th20) {
                            lp1.m16420a(y06.class, th20);
                            return;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        return AbtRegistrar.lambda$getComponents$0(co7Var);
    }
}
