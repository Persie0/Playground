package p150h9;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.text.Layout;
import android.util.Base64;
import android.util.JsonReader;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.InterfaceC2409f;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.drm.InterfaceC2399c;
import com.google.android.exoplayer2.mediacodec.C2427d;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.source.C2499p;
import com.google.android.exoplayer2.source.ads.C2473a;
import com.google.firebase.FirebaseCommonRegistrar;
import dm.C5206f;
import dm.C5207g;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Pattern;
import ne.AbstractC7743b0;
import ne.C7746d;
import org.json.JSONArray;
import p067d8.C5085y;
import p067d8.C5086z;
import p068d9.C5104r;
import p134g8.C5715b;
import p135g9.C5717a;
import p173i8.C6205a;
import p194j8.C6423a;
import p200jf.C6474f;
import p219ka.C6640a;
import p291o7.C7993c0;
import p291o7.C8004n;
import p291o7.C8005o;
import p298oe.C8038a;
import p317p7.C8202i;
import p317p7.C8203j;
import p333q7.C8500b;
import p333q7.RunnableC8499a;
import p395t8.C9220b;
import p395t8.InterfaceC9222d;
import p402u0.InterfaceC9366i;
import p431v7.C9665i;
import p452w8.AbstractC9838s;
import p452w8.C9829j;
import p479xa.C10144m;
import p479xa.InterfaceC10137f;
import p483xe.C10181d;
import re.C8770a;
import tl.C9326n;
import ua.C9496e;

/* JADX INFO: renamed from: h9.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5931p implements C10144m.a, InterfaceC9366i, FeatureManager.InterfaceC2304a, C5104r.a, InterfaceC2409f.a, InterfaceC2399c.b, MediaCodecUtil.InterfaceC2423e, InterfaceC10137f, C6474f.a, C8038a.a, InterfaceC9222d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35352a;

    public /* synthetic */ C5931p(int i10) {
        this.f35352a = i10;
    }

    @Override // p479xa.InterfaceC10137f
    /* JADX INFO: renamed from: a */
    public void mo12173a(Object obj) {
        ((C2499p.b) obj).f13438b.release();
    }

    @Override // p068d9.C5104r.a
    public Object apply(Object obj) {
        switch (this.f35352a) {
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                Cursor cursor = (Cursor) obj;
                C9220b c9220b = C5104r.f33055f;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                Cursor cursor2 = (Cursor) obj;
                C9220b c9220b2 = C5104r.f33055f;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    C9829j.a aVarM18330a = AbstractC9838s.m18330a();
                    aVarM18330a.m18323b(cursor2.getString(1));
                    aVarM18330a.m18324c(C5717a.m12076b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    aVarM18330a.f50029b = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(aVarM18330a.m18322a());
                }
                return arrayList;
            case 8:
                Cursor cursor3 = (Cursor) obj;
                C9220b c9220b3 = C5104r.f33055f;
                ArrayList arrayList2 = new ArrayList();
                int length = 0;
                while (cursor3.moveToNext()) {
                    byte[] blob = cursor3.getBlob(0);
                    arrayList2.add(blob);
                    length += blob.length;
                }
                byte[] bArr = new byte[length];
                int length2 = 0;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i10);
                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                    length2 += bArr2.length;
                }
                return bArr;
            default:
                AbstractC7743b0 abstractC7743b0 = (AbstractC7743b0) obj;
                C8770a.f46490b.getClass();
                C10181d c10181d = C8038a.f43690a;
                c10181d.getClass();
                StringWriter stringWriter = new StringWriter();
                try {
                    c10181d.m19192a(abstractC7743b0, stringWriter);
                    break;
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes(Charset.forName("UTF-8"));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // p298oe.C8038a.a
    /* JADX INFO: renamed from: c */
    public Object mo12175c(JsonReader jsonReader) throws IOException {
        switch (this.f35352a) {
            case 20:
                return C8038a.m15918e(jsonReader);
            case 21:
                C10181d c10181d = C8038a.f43690a;
                jsonReader.beginObject();
                String strNextString = null;
                String strNextString2 = null;
                String strNextString3 = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    strNextName.hashCode();
                    switch (strNextName) {
                        case "libraryName":
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                            break;
                            break;
                        case "arch":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                throw new NullPointerException("Null arch");
                            }
                            break;
                            break;
                        case "buildId":
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null buildId");
                            }
                            break;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                String strM765k = strNextString == null ? " arch" : "";
                if (strNextString2 == null) {
                    strM765k = strM765k.concat(" libraryName");
                }
                if (strNextString3 == null) {
                    strM765k = C0166e.m765k(strM765k, " buildId");
                }
                if (strM765k.isEmpty()) {
                    return new C7746d(strNextString, strNextString2, strNextString3);
                }
                throw new IllegalStateException("Missing required properties:".concat(strM765k));
            default:
                return C8038a.m15914a(jsonReader);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2423e
    /* JADX INFO: renamed from: d */
    public int mo7175d(Object obj) {
        Pattern pattern = MediaCodecUtil.f12594a;
        return ((C2427d) obj).f12615a.startsWith("OMX.google") ? 1 : 0;
    }

    @Override // p200jf.C6474f.a
    /* JADX INFO: renamed from: e */
    public String mo12176e(Context context) {
        context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return "com.android.vending" != 0 ? FirebaseCommonRegistrar.m9146a("com.android.vending") : "";
    }

    @Override // com.google.android.exoplayer2.InterfaceC2409f.a
    /* JADX INFO: renamed from: g */
    public InterfaceC2409f mo7014g(Bundle bundle) {
        switch (this.f35352a) {
            case 10:
                return new C2466p.e(bundle.getLong(C2466p.e.f12824g, -9223372036854775807L), bundle.getLong(C2466p.e.f12825h, -9223372036854775807L), bundle.getLong(C2466p.e.f12826i, -9223372036854775807L), bundle.getFloat(C2466p.e.f12827j, -3.4028235E38f), bundle.getFloat(C2466p.e.f12828k, -3.4028235E38f));
            case 12:
                int i10 = bundle.getInt(AbstractC2382c0.b.f12058h, 0);
                long j10 = bundle.getLong(AbstractC2382c0.b.f12059i, -9223372036854775807L);
                long j11 = bundle.getLong(AbstractC2382c0.b.f12060j, 0L);
                boolean z10 = bundle.getBoolean(AbstractC2382c0.b.f12061k, false);
                Bundle bundle2 = bundle.getBundle(AbstractC2382c0.b.f12062l);
                C2473a c2473a = bundle2 != null ? (C2473a) C2473a.f13033H.mo7014g(bundle2) : C2473a.f13034g;
                AbstractC2382c0.b bVar = new AbstractC2382c0.b();
                bVar.m6918h(null, null, i10, j10, j11, c2473a, z10);
                return bVar;
            case 16:
                long j12 = bundle.getLong(C2473a.a.f13051i);
                int i11 = bundle.getInt(C2473a.a.f13052j);
                int i12 = bundle.getInt(C2473a.a.f13049K);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C2473a.a.f13053k);
                int[] intArray = bundle.getIntArray(C2473a.a.f13054l);
                long[] longArray = bundle.getLongArray(C2473a.a.f13046H);
                long j13 = bundle.getLong(C2473a.a.f13047I);
                boolean z11 = bundle.getBoolean(C2473a.a.f13048J);
                if (intArray == null) {
                    intArray = new int[0];
                }
                return new C2473a.a(j12, i11, i12, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j13, z11);
            case 17:
                C6640a c6640a = C6640a.f37635M;
                C6640a.a aVar = new C6640a.a();
                CharSequence charSequence = bundle.getCharSequence(C6640a.f37636N);
                if (charSequence != null) {
                    aVar.f37671a = charSequence;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(C6640a.f37637O);
                if (alignment != null) {
                    aVar.f37673c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(C6640a.f37638P);
                if (alignment2 != null) {
                    aVar.f37674d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable(C6640a.f37639Q);
                if (bitmap != null) {
                    aVar.f37672b = bitmap;
                }
                String str = C6640a.f37640R;
                if (bundle.containsKey(str)) {
                    String str2 = C6640a.f37641S;
                    if (bundle.containsKey(str2)) {
                        float f3 = bundle.getFloat(str);
                        int i13 = bundle.getInt(str2);
                        aVar.f37675e = f3;
                        aVar.f37676f = i13;
                    }
                }
                String str3 = C6640a.f37642T;
                if (bundle.containsKey(str3)) {
                    aVar.f37677g = bundle.getInt(str3);
                }
                String str4 = C6640a.f37643U;
                if (bundle.containsKey(str4)) {
                    aVar.f37678h = bundle.getFloat(str4);
                }
                String str5 = C6640a.f37644V;
                if (bundle.containsKey(str5)) {
                    aVar.f37679i = bundle.getInt(str5);
                }
                String str6 = C6640a.f37646X;
                if (bundle.containsKey(str6)) {
                    String str7 = C6640a.f37645W;
                    if (bundle.containsKey(str7)) {
                        float f10 = bundle.getFloat(str6);
                        int i14 = bundle.getInt(str7);
                        aVar.f37681k = f10;
                        aVar.f37680j = i14;
                    }
                }
                String str8 = C6640a.f37647Y;
                if (bundle.containsKey(str8)) {
                    aVar.f37682l = bundle.getFloat(str8);
                }
                String str9 = C6640a.f37648Z;
                if (bundle.containsKey(str9)) {
                    aVar.f37683m = bundle.getFloat(str9);
                }
                String str10 = C6640a.f37649a0;
                if (bundle.containsKey(str10)) {
                    aVar.f37685o = bundle.getInt(str10);
                    aVar.f37684n = true;
                }
                if (!bundle.getBoolean(C6640a.f37650b0, false)) {
                    aVar.f37684n = false;
                }
                String str11 = C6640a.f37651c0;
                if (bundle.containsKey(str11)) {
                    aVar.f37686p = bundle.getInt(str11);
                }
                String str12 = C6640a.f37652d0;
                if (bundle.containsKey(str12)) {
                    aVar.f37687q = bundle.getFloat(str12);
                }
                return aVar.m13277a();
            default:
                C9496e.c cVar = C9496e.c.f48826L0;
                return new C9496e.c(new C9496e.c.a(bundle));
        }
    }

    @Override // com.facebook.internal.FeatureManager.InterfaceC2304a
    /* JADX INFO: renamed from: h */
    public void mo6668h(boolean z10) {
        File[] fileArrListFiles;
        int i10 = 0;
        int i11 = 1;
        switch (this.f35352a) {
            case 1:
                C8004n c8004n = C8004n.f43550a;
                if (z10) {
                    int i12 = C8203j.f44401a;
                    if (!C6205a.m12742b(C8203j.class)) {
                        try {
                            FetchedAppSettingsManager.f11555f.add(new C8202i());
                            FetchedAppSettingsManager.m6671c();
                        } catch (Throwable th2) {
                            C6205a.m12741a(C8203j.class, th2);
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (z10) {
                    C8500b c8500b = C8500b.f45741a;
                    if (!C6205a.m12742b(C8500b.class)) {
                        try {
                            try {
                                C8004n.m15873c().execute(new RunnableC8499a(i10));
                            } catch (Exception e10) {
                                C5086z c5086z = C5086z.f33015a;
                                C5086z.m10806E(C8500b.f45742b, e10);
                                return;
                            }
                        } catch (Throwable th3) {
                            C6205a.m12741a(C8500b.class, th3);
                        }
                        break;
                    }
                }
                break;
            case 3:
                if (z10) {
                    C9665i c9665i = C9665i.f49496a;
                    if (!C6205a.m12742b(C9665i.class)) {
                        try {
                            C9665i.f49497b.set(true);
                            C9665i.m18149a();
                        } catch (Throwable th4) {
                            C6205a.m12741a(C9665i.class, th4);
                        }
                    }
                }
                break;
            default:
                if (z10) {
                    C8004n c8004n2 = C8004n.f43550a;
                    if (C7993c0.m15849b()) {
                        if (!C5086z.m10840y()) {
                            File fileM10997S0 = C5206f.m10997S0();
                            int i13 = 2;
                            if (fileM10997S0 == null) {
                                fileArrListFiles = new File[0];
                            } else {
                                fileArrListFiles = fileM10997S0.listFiles(new C5085y(i13));
                                C5207g.m11110e(fileArrListFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
                            }
                            ArrayList arrayList = new ArrayList();
                            int length = fileArrListFiles.length;
                            int i14 = 0;
                            while (i14 < length) {
                                File file = fileArrListFiles[i14];
                                i14++;
                                C6423a c6423a = new C6423a(file);
                                if ((c6423a.f36899b == null || c6423a.f36900c == null) ? false : true) {
                                    arrayList.add(c6423a);
                                }
                            }
                            C9326n.m17682B(arrayList, new C5715b(i11));
                            JSONArray jSONArray = new JSONArray();
                            while (i10 < arrayList.size() && i10 < 1000) {
                                jSONArray.put(arrayList.get(i10));
                                i10++;
                            }
                            C5206f.m11019q1("error_reports", jSONArray, new C8005o(i13, arrayList));
                        }
                    }
                }
                break;
        }
    }

    @Override // p402u0.InterfaceC9366i
    /* JADX INFO: renamed from: j */
    public double mo11741j(double d10) {
        double d11 = d10 < 0.0d ? -d10 : d10;
        return Math.copySign(d11 >= 0.04045d ? Math.pow((0.9478672985781991d * d11) + 0.05213270142180095d, 2.4d) : d11 * 0.07739938080495357d, d10);
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public void mo780n(Object obj) {
        ((InterfaceC2532v.c) obj).mo7488H(this.f35352a);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2399c.b
    public void release() {
    }
}
