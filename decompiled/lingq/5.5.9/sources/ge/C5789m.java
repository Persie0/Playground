package ge;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.util.Base64;
import android.util.JsonReader;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.appevents.p050ml.ModelManager;
import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.AbstractC2535x;
import com.google.android.exoplayer2.C2380b0;
import com.google.android.exoplayer2.C2463n;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.C2467q;
import com.google.android.exoplayer2.C2504t;
import com.google.android.exoplayer2.C2537z;
import com.google.android.exoplayer2.InterfaceC2409f;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.AbstractC3254q;
import com.tonyodev.fetch2.Request;
import dm.C5207g;
import ga.C5735r;
import ga.C5736s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import ne.AbstractC7743b0;
import ne.C7758o;
import p067d8.C5086z;
import p068d9.C5104r;
import p069da.C5112a;
import p118fe.C5523o;
import p118fe.C5527s;
import p118fe.C5528t;
import p118fe.InterfaceC5514f;
import p122fl.InterfaceC5585h;
import p173i8.C6205a;
import p178if.C6325a;
import p200jf.AbstractC6472d;
import p200jf.C6470b;
import p200jf.C6471c;
import p200jf.C6474f;
import p261m9.C7505f;
import p261m9.InterfaceC7507h;
import p291o7.C8004n;
import p298oe.C8038a;
import p317p7.RunnableC8194a;
import p395t8.InterfaceC9222d;
import p395t8.InterfaceC9225g;
import p396t9.C9229d;
import p479xa.C10129a;
import p479xa.C10131b;
import p479xa.InterfaceC10137f;
import p483xe.C10181d;
import ua.C9508q;
import ye.C10355d;

/* JADX INFO: renamed from: ge.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5789m implements InterfaceC5514f, InterfaceC5585h, FeatureManager.InterfaceC2304a, InterfaceC9225g, C5104r.a, InterfaceC2409f.a, InterfaceC10137f, C7505f.a.InterfaceC10651a, C5112a.a, C6474f.a, C8038a.a, InterfaceC9222d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34990a;

    public /* synthetic */ C5789m(int i10) {
        this.f34990a = i10;
    }

    @Override // p479xa.InterfaceC10137f
    /* JADX INFO: renamed from: a */
    public void mo12173a(Object obj) {
        ((InterfaceC2398b.a) obj).m6969c();
    }

    @Override // p068d9.C5104r.a
    public Object apply(Object obj) {
        switch (this.f34990a) {
            case 4:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            default:
                C6325a c6325a = (C6325a) obj;
                c6325a.getClass();
                C10355d c10355d = AbstractC3254q.f16415a;
                c10355d.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    c10355d.m19368a(c6325a, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // p261m9.C7505f.a.InterfaceC10651a
    /* JADX INFO: renamed from: b */
    public Constructor mo12174b() {
        int[] iArr = C7505f.f41481d;
        return Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0])) ? Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC7507h.class).getConstructor(Integer.TYPE) : null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p298oe.C8038a.a
    /* JADX INFO: renamed from: c */
    public Object mo12175c(JsonReader jsonReader) throws IOException {
        switch (this.f34990a) {
            case 21:
                return C8038a.m15915b(jsonReader);
            default:
                C10181d c10181d = C8038a.f43690a;
                C7758o.a aVar = new C7758o.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "name":
                            String strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                throw new NullPointerException("Null name");
                            }
                            aVar.f42629c = strNextString;
                            break;
                            break;
                        case "size":
                            aVar.f42628b = Long.valueOf(jsonReader.nextLong());
                            break;
                        case "uuid":
                            aVar.f42630d = new String(Base64.decode(jsonReader.nextString(), 2), AbstractC7743b0.f42522a);
                            break;
                        case "baseAddress":
                            aVar.f42627a = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return aVar.m15468a();
        }
    }

    @Override // p122fl.InterfaceC5585h
    /* JADX INFO: renamed from: d */
    public void mo520d(Object obj) {
        switch (this.f34990a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5207g.m11111f((Request) obj, "updatedRequest");
                break;
            default:
                C5207g.m11111f((Request) obj, "updatedRequest");
                break;
        }
    }

    @Override // p200jf.C6474f.a
    /* JADX INFO: renamed from: e */
    public String mo12176e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    @Override // p069da.C5112a.a
    /* JADX INFO: renamed from: f */
    public boolean mo10892f(int i10, int i11, int i12, int i13, int i14) {
        C5789m c5789m = C9229d.f47844u;
        if (i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) {
            if (i11 != 77 || i12 != 76 || i13 != 76 || (i14 != 84 && i10 != 2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2409f.a
    /* JADX INFO: renamed from: g */
    public InterfaceC2409f mo7014g(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        switch (this.f34990a) {
            case 5:
                String string = bundle.getString(C2466p.f12766h, "");
                string.getClass();
                Bundle bundle4 = bundle.getBundle(C2466p.f12767i);
                C2466p.e eVar = bundle4 == null ? C2466p.e.f12823f : (C2466p.e) C2466p.e.f12829l.mo7014g(bundle4);
                Bundle bundle5 = bundle.getBundle(C2466p.f12768j);
                C2467q c2467q = bundle5 == null ? C2467q.f12883d0 : (C2467q) C2467q.f12882L0.mo7014g(bundle5);
                Bundle bundle6 = bundle.getBundle(C2466p.f12769k);
                C2466p.c cVar = bundle6 == null ? C2466p.c.f12806H : (C2466p.c) C2466p.b.f12795l.mo7014g(bundle6);
                Bundle bundle7 = bundle.getBundle(C2466p.f12770l);
                return new C2466p(string, cVar, null, eVar, c2467q, bundle7 == null ? C2466p.h.f12847c : (C2466p.h) C2466p.h.f12851g.mo7014g(bundle7));
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C2467q.a aVar = new C2467q.a();
                aVar.f12947a = bundle.getCharSequence(C2467q.f12884e0);
                aVar.f12948b = bundle.getCharSequence(C2467q.f12885f0);
                aVar.f12949c = bundle.getCharSequence(C2467q.f12886g0);
                aVar.f12950d = bundle.getCharSequence(C2467q.f12887h0);
                aVar.f12951e = bundle.getCharSequence(C2467q.f12888i0);
                aVar.f12952f = bundle.getCharSequence(C2467q.f12889j0);
                aVar.f12953g = bundle.getCharSequence(C2467q.f12890k0);
                byte[] byteArray = bundle.getByteArray(C2467q.f12893n0);
                String str = C2467q.f12877G0;
                Integer numValueOf = bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null;
                aVar.f12956j = byteArray != null ? (byte[]) byteArray.clone() : null;
                aVar.f12957k = numValueOf;
                aVar.f12958l = (Uri) bundle.getParcelable(C2467q.f12894o0);
                aVar.f12970x = bundle.getCharSequence(C2467q.f12905z0);
                aVar.f12971y = bundle.getCharSequence(C2467q.f12871A0);
                aVar.f12972z = bundle.getCharSequence(C2467q.f12872B0);
                aVar.f12942C = bundle.getCharSequence(C2467q.f12875E0);
                aVar.f12943D = bundle.getCharSequence(C2467q.f12876F0);
                aVar.f12944E = bundle.getCharSequence(C2467q.f12878H0);
                aVar.f12946G = bundle.getBundle(C2467q.f12881K0);
                String str2 = C2467q.f12891l0;
                if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
                    aVar.f12954h = (AbstractC2535x) AbstractC2535x.f13786b.mo7014g(bundle3);
                }
                String str3 = C2467q.f12892m0;
                if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
                    aVar.f12955i = (AbstractC2535x) AbstractC2535x.f13786b.mo7014g(bundle2);
                }
                String str4 = C2467q.f12895p0;
                if (bundle.containsKey(str4)) {
                    aVar.f12959m = Integer.valueOf(bundle.getInt(str4));
                }
                String str5 = C2467q.f12896q0;
                if (bundle.containsKey(str5)) {
                    aVar.f12960n = Integer.valueOf(bundle.getInt(str5));
                }
                String str6 = C2467q.f12897r0;
                if (bundle.containsKey(str6)) {
                    aVar.f12961o = Integer.valueOf(bundle.getInt(str6));
                }
                String str7 = C2467q.f12880J0;
                if (bundle.containsKey(str7)) {
                    aVar.f12962p = Boolean.valueOf(bundle.getBoolean(str7));
                }
                String str8 = C2467q.f12898s0;
                if (bundle.containsKey(str8)) {
                    aVar.f12963q = Boolean.valueOf(bundle.getBoolean(str8));
                }
                String str9 = C2467q.f12899t0;
                if (bundle.containsKey(str9)) {
                    aVar.f12964r = Integer.valueOf(bundle.getInt(str9));
                }
                String str10 = C2467q.f12900u0;
                if (bundle.containsKey(str10)) {
                    aVar.f12965s = Integer.valueOf(bundle.getInt(str10));
                }
                String str11 = C2467q.f12901v0;
                if (bundle.containsKey(str11)) {
                    aVar.f12966t = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = C2467q.f12902w0;
                if (bundle.containsKey(str12)) {
                    aVar.f12967u = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = C2467q.f12903x0;
                if (bundle.containsKey(str13)) {
                    aVar.f12968v = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = C2467q.f12904y0;
                if (bundle.containsKey(str14)) {
                    aVar.f12969w = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = C2467q.f12873C0;
                if (bundle.containsKey(str15)) {
                    aVar.f12940A = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = C2467q.f12874D0;
                if (bundle.containsKey(str16)) {
                    aVar.f12941B = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = C2467q.f12879I0;
                if (bundle.containsKey(str17)) {
                    aVar.f12945F = Integer.valueOf(bundle.getInt(str17));
                }
                return new C2467q(aVar);
            case 8:
                int i10 = bundle.getInt(AbstractC2535x.f13785a, -1);
                if (i10 == 0) {
                    return (AbstractC2535x) C2463n.f12758g.mo7014g(bundle);
                }
                if (i10 == 1) {
                    return (AbstractC2535x) C2504t.f13471e.mo7014g(bundle);
                }
                if (i10 == 2) {
                    return (AbstractC2535x) C2537z.f13789g.mo7014g(bundle);
                }
                if (i10 == 3) {
                    return (AbstractC2535x) C2380b0.f12044g.mo7014g(bundle);
                }
                throw new IllegalArgumentException(C0166e.m761g("Unknown RatingType: ", i10));
            case 9:
                String str18 = C2380b0.f12042e;
                C10129a.m18990b(bundle.getInt(AbstractC2535x.f13785a, -1) == 3);
                return bundle.getBoolean(C2380b0.f12042e, false) ? new C2380b0(bundle.getBoolean(C2380b0.f12043f, false)) : new C2380b0();
            case 16:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C5736s.f34806e);
                return parcelableArrayList == null ? new C5736s(new C5735r[0]) : new C5736s((C5735r[]) C10131b.m19007a(C5735r.f34799h, parcelableArrayList).toArray(new C5735r[0]));
            default:
                C9508q c9508q = C9508q.f48930V;
                return new C9508q(new C9508q.a(bundle));
        }
    }

    @Override // com.facebook.internal.FeatureManager.InterfaceC2304a
    /* JADX INFO: renamed from: h */
    public void mo6668h(boolean z10) {
        switch (this.f34990a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                if (z10) {
                    C8004n.f43565p = true;
                }
                break;
            default:
                if (z10) {
                    ModelManager modelManager = ModelManager.f11524a;
                    if (!C6205a.m12742b(ModelManager.class)) {
                        try {
                            RunnableC8194a runnableC8194a = new RunnableC8194a(3);
                            C5086z c5086z = C5086z.f33015a;
                            try {
                                C8004n.m15873c().execute(runnableC8194a);
                                break;
                            } catch (Exception unused) {
                            }
                        } catch (Throwable th2) {
                            C6205a.m12741a(ModelManager.class, th2);
                        }
                    }
                }
                break;
        }
    }

    @Override // p395t8.InterfaceC9225g
    /* JADX INFO: renamed from: i */
    public void mo12177i(Exception exc) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p118fe.InterfaceC5514f
    /* JADX INFO: renamed from: k */
    public Object mo35k(C5528t c5528t) {
        switch (this.f34990a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5523o<ScheduledExecutorService> c5523o = ExecutorsRegistrar.f16187a;
                return UiExecutor.INSTANCE;
            case 1:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(c5528t);
            default:
                Set setMo11754g = c5528t.mo11754g(C5527s.m11765a(AbstractC6472d.class));
                C6471c c6471c = C6471c.f37045b;
                if (c6471c == null) {
                    synchronized (C6471c.class) {
                        c6471c = C6471c.f37045b;
                        if (c6471c == null) {
                            c6471c = new C6471c();
                            C6471c.f37045b = c6471c;
                        }
                        break;
                    }
                }
                return new C6470b(setMo11754g, c6471c);
        }
    }
}
