package p402u0;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.GraphRequest;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentData;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.exoplayer2.AbstractC2535x;
import com.google.android.exoplayer2.C2384d0;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.C2537z;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.InterfaceC2409f;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.android.exoplayer2.mediacodec.C2427d;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.ads.C2473a;
import com.google.firebase.messaging.C3246i;
import dm.C5206f;
import dm.C5207g;
import dm.C5212l;
import ga.C5735r;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5056a0;
import p067d8.C5086z;
import p068d9.C5104r;
import p069da.C5112a;
import p112f8.C5477b;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5745a;
import p149h8.C5900a;
import p150h9.C5931p;
import p173i8.C6205a;
import p200jf.C6474f;
import p217k8.C6630a;
import p251m.InterfaceC7449a;
import p261m9.C7505f;
import p261m9.InterfaceC7507h;
import p291o7.AsyncTaskC8008r;
import p291o7.C7992c;
import p291o7.C7993c0;
import p291o7.C8002l;
import p291o7.C8004n;
import p291o7.C8009s;
import p298oe.C8038a;
import p395t8.C9220b;
import p409u7.C9475a;
import p479xa.C10129a;
import p479xa.C10131b;
import p479xa.C10134c0;
import p479xa.C10144m;
import p479xa.InterfaceC10137f;
import p482xd.C10172d;
import p505ya.C10320b;
import p505ya.C10332n;

/* JADX INFO: renamed from: u0.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9362e implements InterfaceC9366i, InterfaceC7449a, FeatureManager.InterfaceC2304a, C5104r.a, C10144m.a, InterfaceC2409f.a, InterfaceC10137f, C7505f.a.InterfaceC10651a, MediaCodecUtil.InterfaceC2423e, C5112a.a, C6474f.a, C8038a.a, InterfaceC5745a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48104a;

    public /* synthetic */ C9362e(int i10) {
        this.f48104a = i10;
    }

    @Override // p479xa.InterfaceC10137f
    /* JADX INFO: renamed from: a */
    public final void mo12173a(Object obj) {
        ((InterfaceC2398b.a) obj).m6967a();
    }

    @Override // p251m.InterfaceC7449a
    public final Object apply(Object obj) {
        switch (this.f48104a) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C9220b c9220b = C5104r.f33055f;
                throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
            case 8:
                C9220b c9220b2 = C5104r.f33055f;
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            default:
                Cursor cursor = (Cursor) obj;
                C9220b c9220b3 = C5104r.f33055f;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return null;
        }
    }

    @Override // p261m9.C7505f.a.InterfaceC10651a
    /* JADX INFO: renamed from: b */
    public final Constructor mo12174b() {
        int[] iArr = C7505f.f41481d;
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(InterfaceC7507h.class).getConstructor(new Class[0]);
    }

    @Override // p298oe.C8038a.a
    /* JADX INFO: renamed from: c */
    public final Object mo12175c(JsonReader jsonReader) {
        return C8038a.m15914a(jsonReader);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2423e
    /* JADX INFO: renamed from: d */
    public final int mo7175d(Object obj) {
        Pattern pattern = MediaCodecUtil.f12594a;
        String str = ((C2427d) obj).f12615a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (C10134c0.f51354a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // p200jf.C6474f.a
    /* JADX INFO: renamed from: e */
    public final String mo12176e(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    @Override // p069da.C5112a.a
    /* JADX INFO: renamed from: f */
    public final boolean mo10892f(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2409f.a
    /* JADX INFO: renamed from: g */
    public final InterfaceC2409f mo7014g(Bundle bundle) {
        C2473a.a[] aVarArr;
        boolean z10 = true;
        int i10 = 0;
        switch (this.f48104a) {
            case 12:
                C2416m c2416m = C2416m.f12428d0;
                C2416m.a aVar = new C2416m.a();
                if (bundle != null) {
                    ClassLoader classLoader = C10131b.class.getClassLoader();
                    int i11 = C10134c0.f51354a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(C2416m.f12429e0);
                C2416m c2416m2 = C2416m.f12428d0;
                String str = c2416m2.f12470a;
                if (string == null) {
                    string = str;
                }
                aVar.f12491a = string;
                String string2 = bundle.getString(C2416m.f12430f0);
                if (string2 == null) {
                    string2 = c2416m2.f12472b;
                }
                aVar.f12492b = string2;
                String string3 = bundle.getString(C2416m.f12431g0);
                if (string3 == null) {
                    string3 = c2416m2.f12474c;
                }
                aVar.f12493c = string3;
                aVar.f12494d = bundle.getInt(C2416m.f12432h0, c2416m2.f12476d);
                aVar.f12495e = bundle.getInt(C2416m.f12433i0, c2416m2.f12477e);
                aVar.f12496f = bundle.getInt(C2416m.f12434j0, c2416m2.f12478f);
                aVar.f12497g = bundle.getInt(C2416m.f12435k0, c2416m2.f12479g);
                String string4 = bundle.getString(C2416m.f12436l0);
                if (string4 == null) {
                    string4 = c2416m2.f12481i;
                }
                aVar.f12498h = string4;
                Metadata metadata = (Metadata) bundle.getParcelable(C2416m.f12437m0);
                if (metadata == null) {
                    metadata = c2416m2.f12482j;
                }
                aVar.f12499i = metadata;
                String string5 = bundle.getString(C2416m.f12438n0);
                if (string5 == null) {
                    string5 = c2416m2.f12483k;
                }
                aVar.f12500j = string5;
                String string6 = bundle.getString(C2416m.f12439o0);
                if (string6 == null) {
                    string6 = c2416m2.f12484l;
                }
                aVar.f12501k = string6;
                aVar.f12502l = bundle.getInt(C2416m.f12440p0, c2416m2.f12451H);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(C2416m.m7123c(i10));
                    if (byteArray == null) {
                        aVar.f12503m = arrayList;
                        aVar.f12504n = (DrmInitData) bundle.getParcelable(C2416m.f12442r0);
                        aVar.f12505o = bundle.getLong(C2416m.f12443s0, c2416m2.f12454K);
                        aVar.f12506p = bundle.getInt(C2416m.f12444t0, c2416m2.f12455L);
                        aVar.f12507q = bundle.getInt(C2416m.f12445u0, c2416m2.f12456M);
                        aVar.f12508r = bundle.getFloat(C2416m.f12446v0, c2416m2.f12457N);
                        aVar.f12509s = bundle.getInt(C2416m.f12447w0, c2416m2.f12458O);
                        aVar.f12510t = bundle.getFloat(C2416m.f12448x0, c2416m2.f12459P);
                        aVar.f12511u = bundle.getByteArray(C2416m.f12449y0);
                        aVar.f12512v = bundle.getInt(C2416m.f12450z0, c2416m2.f12461R);
                        Bundle bundle2 = bundle.getBundle(C2416m.f12417A0);
                        if (bundle2 != null) {
                            aVar.f12513w = (C10320b) C10320b.f51895j.mo7014g(bundle2);
                        }
                        aVar.f12514x = bundle.getInt(C2416m.f12418B0, c2416m2.f12463T);
                        aVar.f12515y = bundle.getInt(C2416m.f12419C0, c2416m2.f12464U);
                        aVar.f12516z = bundle.getInt(C2416m.f12420D0, c2416m2.f12465V);
                        aVar.f12485A = bundle.getInt(C2416m.f12421E0, c2416m2.f12466W);
                        aVar.f12486B = bundle.getInt(C2416m.f12422F0, c2416m2.f12467X);
                        aVar.f12487C = bundle.getInt(C2416m.f12423G0, c2416m2.f12468Y);
                        aVar.f12488D = bundle.getInt(C2416m.f12425I0, c2416m2.f12469Z);
                        aVar.f12489E = bundle.getInt(C2416m.f12426J0, c2416m2.f12471a0);
                        aVar.f12490F = bundle.getInt(C2416m.f12424H0, c2416m2.f12473b0);
                        return new C2416m(aVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
                break;
            case 13:
                C2466p.b.a aVar2 = new C2466p.b.a();
                C2466p.c cVar = C2466p.b.f12789f;
                long j10 = bundle.getLong(C2466p.b.f12790g, cVar.f12796a);
                C10129a.m18990b(j10 >= 0);
                aVar2.f12801a = j10;
                long j11 = bundle.getLong(C2466p.b.f12791h, cVar.f12797b);
                if (j11 != Long.MIN_VALUE && j11 < 0) {
                    z10 = false;
                }
                C10129a.m18990b(z10);
                aVar2.f12802b = j11;
                aVar2.f12803c = bundle.getBoolean(C2466p.b.f12792i, cVar.f12798c);
                aVar2.f12804d = bundle.getBoolean(C2466p.b.f12793j, cVar.f12799d);
                aVar2.f12805e = bundle.getBoolean(C2466p.b.f12794k, cVar.f12800e);
                return new C2466p.c(aVar2);
            case 15:
                String str2 = C2537z.f13787e;
                C10129a.m18990b(bundle.getInt(AbstractC2535x.f13785a, -1) == 2);
                int i12 = bundle.getInt(C2537z.f13787e, 5);
                float f3 = bundle.getFloat(C2537z.f13788f, -1.0f);
                return f3 == -1.0f ? new C2537z(i12) : new C2537z(i12, f3);
            case 17:
                String str3 = C2384d0.a.f12106f;
                C8002l c8002l = C5735r.f34799h;
                Bundle bundle3 = bundle.getBundle(C2384d0.a.f12106f);
                bundle3.getClass();
                C5735r c5735r = (C5735r) c8002l.mo7014g(bundle3);
                return new C2384d0.a(c5735r, bundle.getBoolean(C2384d0.a.f12109i, false), (int[]) C10172d.m19190a(bundle.getIntArray(C2384d0.a.f12107g), new int[c5735r.f34800a]), (boolean[]) C10172d.m19190a(bundle.getBooleanArray(C2384d0.a.f12108h), new boolean[c5735r.f34800a]));
            case 22:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C2473a.f13036i);
                if (parcelableArrayList == null) {
                    aVarArr = new C2473a.a[0];
                } else {
                    C2473a.a[] aVarArr2 = new C2473a.a[parcelableArrayList.size()];
                    for (int i13 = 0; i13 < parcelableArrayList.size(); i13++) {
                        aVarArr2[i13] = (C2473a.a) C2473a.a.f13050L.mo7014g((Bundle) parcelableArrayList.get(i13));
                    }
                    aVarArr = aVarArr2;
                }
                return new C2473a(null, aVarArr, bundle.getLong(C2473a.f13037j, 0L), bundle.getLong(C2473a.f13038k, -9223372036854775807L), bundle.getInt(C2473a.f13039l, 0));
            default:
                return new C10332n(bundle.getFloat(C10332n.f52015i, 1.0f), bundle.getInt(C10332n.f52012f, 0), bundle.getInt(C10332n.f52013g, 0), bundle.getInt(C10332n.f52014h, 0));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.internal.FeatureManager.InterfaceC2304a
    /* JADX INFO: renamed from: h */
    public final void mo6668h(boolean z10) {
        File[] fileArrListFiles;
        int i10 = 1;
        switch (this.f48104a) {
            case 3:
                C8004n c8004n = C8004n.f43550a;
                if (z10) {
                    if (!C7993c0.m15849b()) {
                        return;
                    }
                    FeatureManager featureManager = FeatureManager.f11546a;
                    FeatureManager.m6664a(new C9362e(6), FeatureManager.Feature.CrashReport);
                    FeatureManager.m6664a(new C5931p(4), FeatureManager.Feature.ErrorReport);
                    FeatureManager.m6664a(new C8002l(5), FeatureManager.Feature.AnrReport);
                }
                return;
            case 4:
                if (z10) {
                    C8004n.f43566q = true;
                    return;
                } else {
                    C8004n c8004n2 = C8004n.f43550a;
                    return;
                }
            case 5:
                if (z10) {
                    C9475a c9475a = C9475a.f48579a;
                    if (C6205a.m12742b(C9475a.class)) {
                        return;
                    }
                    try {
                        C9475a.f48580b = true;
                        C9475a.f48579a.m17896a();
                        return;
                    } catch (Throwable th2) {
                        C6205a.m12741a(C9475a.class, th2);
                        return;
                    }
                }
                return;
            default:
                if (z10) {
                    synchronized (C5900a.f35244b) {
                        C8004n c8004n3 = C8004n.f43550a;
                        if (C7993c0.m15849b()) {
                            C5900a.a.m12320a();
                        }
                        if (C5900a.f35245c != null) {
                            Log.w("h8.a", "Already enabled!");
                        } else {
                            C5900a c5900a = new C5900a(Thread.getDefaultUncaughtExceptionHandler());
                            C5900a.f35245c = c5900a;
                            Thread.setDefaultUncaughtExceptionHandler(c5900a);
                        }
                    }
                    FeatureManager featureManager2 = FeatureManager.f11546a;
                    if (FeatureManager.m6666c(FeatureManager.Feature.CrashShield)) {
                        C5212l.f33288g = true;
                        if (C7993c0.m15849b() && !C5086z.m10840y()) {
                            File fileM10997S0 = C5206f.m10997S0();
                            int i11 = 0;
                            if (fileM10997S0 == null) {
                                fileArrListFiles = new File[0];
                            } else {
                                fileArrListFiles = fileM10997S0.listFiles(new C5477b(i11));
                                if (fileArrListFiles == null) {
                                    fileArrListFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            int length = fileArrListFiles.length;
                            int i12 = 0;
                            while (i12 < length) {
                                File file = fileArrListFiles[i12];
                                i12++;
                                C5207g.m11111f(file, "file");
                                InstrumentData instrumentData = new InstrumentData(file);
                                if (instrumentData.m6679b()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", instrumentData.toString());
                                        String str = GraphRequest.f11448j;
                                        String str2 = String.format("%s/instruments", Arrays.copyOf(new Object[]{C8004n.m15872b()}, 1));
                                        C5207g.m11110e(str2, "java.lang.String.format(format, *args)");
                                        arrayList.add(GraphRequest.C2279c.m6622h(null, str2, jSONObject, new C7992c(i10, instrumentData)));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                C8009s c8009s = new C8009s(arrayList);
                                String str3 = GraphRequest.f11448j;
                                C5056a0.m10745c(c8009s);
                                new AsyncTaskC8008r(c8009s).executeOnExecutor(C8004n.m15873c(), new Void[0]);
                            }
                        }
                        C6205a.f36097b = true;
                    }
                    FeatureManager featureManager3 = FeatureManager.f11546a;
                    if (FeatureManager.m6666c(FeatureManager.Feature.ThreadCheck)) {
                        int i13 = C6630a.f37590a;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // p136gc.InterfaceC5745a
    /* JADX INFO: renamed from: i */
    public final Object mo5485i(AbstractC5751g abstractC5751g) {
        Object obj = C3246i.f16394c;
        return 403;
    }

    @Override // p402u0.InterfaceC9366i
    /* JADX INFO: renamed from: j */
    public final double mo11741j(double d10) {
        double d11;
        switch (this.f48104a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                double dPow = d10 < 0.0d ? -d10 : d10;
                if (dPow >= 0.0031308049535603718d) {
                    dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
                    d11 = 0.9478672985781991d;
                } else {
                    d11 = 0.07739938080495357d;
                }
                return Math.copySign(dPow / d11, d10);
            default:
                return d10;
        }
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        switch (this.f48104a) {
            case 10:
                int i10 = C2413j.f12267x0;
                ((InterfaceC2532v.c) obj).mo7510z(new ExoPlaybackException(2, new ExoTimeoutException(1), 1003));
                break;
            default:
                ((InterfaceC2532v.c) obj).mo7485C();
                break;
        }
    }
}
