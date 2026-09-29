package p000;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Base64;
import android.util.JsonReader;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hm2 implements sg5, tm0, gr6 {

    /* JADX INFO: renamed from: b */
    public static final hm2 f42604b = new hm2(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42605a;

    public /* synthetic */ hm2(C3496qf c3496qf) {
        this.f42605a = 19;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13331a(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    /* JADX INFO: renamed from: b */
    public Object m13332b(JsonReader jsonReader) throws IOException {
        boolean z = false;
        switch (this.f42605a) {
            case 9:
                gv5 gv5Var = new gv5(z);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "libraryName":
                            gv5Var.m12889S(jsonReader.nextString());
                            break;
                        case "arch":
                            gv5Var.m12884N(jsonReader.nextString());
                            break;
                        case "buildId":
                            gv5Var.m12885O(jsonReader.nextString());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return gv5Var.m12911s();
            case 10:
                jsonReader.beginObject();
                String strNextString = null;
                byte[] bArrDecode = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("filename")) {
                        strNextString = jsonReader.nextString();
                        if (strNextString == null) {
                            C3386nv.m17635v("Null filename");
                            return null;
                        }
                    } else if (strNextName2.equals("contents")) {
                        bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                        if (bArrDecode == null) {
                            C3386nv.m17635v("Null contents");
                            return null;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (strNextString != null && bArrDecode != null) {
                    return new e30(strNextString, bArrDecode);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" filename");
                }
                if (bArrDecode == null) {
                    sb.append(" contents");
                }
                C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
                return null;
            case 11:
                a40 a40Var = new a40();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName3 = jsonReader.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "parameterKey":
                            a40Var.m98b(jsonReader.nextString());
                            break;
                        case "templateVersion":
                            a40Var.m99c(jsonReader.nextLong());
                            break;
                        case "rolloutVariant":
                            jsonReader.beginObject();
                            String strNextString2 = null;
                            String strNextString3 = null;
                            while (jsonReader.hasNext()) {
                                String strNextName4 = jsonReader.nextName();
                                strNextName4.getClass();
                                if (strNextName4.equals("variantId")) {
                                    strNextString3 = jsonReader.nextString();
                                    if (strNextString3 == null) {
                                        C3386nv.m17635v("Null variantId");
                                        return null;
                                    }
                                } else if (strNextName4.equals("rolloutId")) {
                                    strNextString2 = jsonReader.nextString();
                                    if (strNextString2 == null) {
                                        C3386nv.m17635v("Null rolloutId");
                                        return null;
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (strNextString2 != null && strNextString3 != null) {
                                a40Var.f194a = new c40(strNextString2, strNextString3);
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                if (strNextString2 == null) {
                                    sb2.append(" rolloutId");
                                }
                                if (strNextString3 == null) {
                                    sb2.append(" variantId");
                                }
                                C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb2));
                                return null;
                            }
                            break;
                        case "parameterValue":
                            String strNextString4 = jsonReader.nextString();
                            if (strNextString4 == null) {
                                C3386nv.m17635v("Null parameterValue");
                                break;
                            } else {
                                a40Var.f196c = strNextString4;
                                break;
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return a40Var.m97a();
            case 12:
                jsonReader.beginObject();
                byte b = 0;
                int iNextInt = 0;
                String strNextString5 = null;
                List listM25276d = null;
                while (jsonReader.hasNext()) {
                    String strNextName5 = jsonReader.nextName();
                    strNextName5.getClass();
                    switch (strNextName5) {
                        case "frames":
                            listM25276d = yq1.m25276d(jsonReader, new hm2(14));
                            if (listM25276d == null) {
                                C3386nv.m17635v("Null frames");
                                return null;
                            }
                            continue;
                            break;
                            break;
                        case "name":
                            strNextString5 = jsonReader.nextString();
                            if (strNextString5 == null) {
                                C3386nv.m17635v("Null name");
                                return null;
                            }
                            break;
                        case "importance":
                            iNextInt = jsonReader.nextInt();
                            b = (byte) (b | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b == 1 && strNextString5 != null && listM25276d != null) {
                    return new s30(iNextInt, strNextString5, listM25276d);
                }
                StringBuilder sb3 = new StringBuilder();
                if (strNextString5 == null) {
                    sb3.append(" name");
                }
                if ((b & 1) == 0) {
                    sb3.append(" importance");
                }
                if (listM25276d == null) {
                    sb3.append(" frames");
                }
                C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb3));
                return null;
            case 13:
                jsonReader.beginObject();
                byte b2 = 0;
                String strNextString6 = null;
                String str = null;
                long jNextLong = 0;
                long jNextLong2 = 0;
                while (jsonReader.hasNext()) {
                    String strNextName6 = jsonReader.nextName();
                    strNextName6.getClass();
                    switch (strNextName6) {
                        case "name":
                            strNextString6 = jsonReader.nextString();
                            if (strNextString6 == null) {
                                C3386nv.m17635v("Null name");
                                return null;
                            }
                            break;
                            break;
                        case "size":
                            b2 = (byte) (b2 | 2);
                            jNextLong2 = jsonReader.nextLong();
                            break;
                        case "uuid":
                            str = new String(Base64.decode(jsonReader.nextString(), 2), vq1.f65777a);
                            break;
                        case "baseAddress":
                            b2 = (byte) (b2 | 1);
                            jNextLong = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b2 == 3 && strNextString6 != null) {
                    return new p30(jNextLong, jNextLong2, strNextString6, str);
                }
                StringBuilder sb4 = new StringBuilder();
                if ((b2 & 1) == 0) {
                    sb4.append(" baseAddress");
                }
                if ((b2 & 2) == 0) {
                    sb4.append(" size");
                }
                if (strNextString6 == null) {
                    sb4.append(" name");
                }
                C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb4));
                return null;
            case 14:
                return yq1.m25273a(jsonReader);
            default:
                return yq1.m25273a(jsonReader);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m13333c() {
    }

    @Override // p000.tm0
    public void cancel() {
    }

    @Override // p000.sg5
    public void invoke(Object obj) {
        long jM22801F;
        cc4 cc4Var;
        mw2 mw2Var;
        i92 i92Var;
        switch (this.f42605a) {
            case 1:
                n52 n52Var = (n52) obj;
                s52 s52Var = n52Var.f52359b;
                if (n52Var == s52Var.f60352j && s52Var.f60356n != null) {
                    p52 p52Var = s52Var.f60358p;
                    int i = p52Var.f55590b;
                    if (i != -1) {
                        long j = ((C3776xy) p52Var.f55593e).f68941f / i;
                        C3851zz c3851zz = s52Var.f60362t;
                        c3851zz.getClass();
                        jM22801F = uma.m22801F(c3851zz.f72401a.getSampleRate(), j);
                    } else {
                        jM22801F = -9223372036854775807L;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - s52Var.f60337W;
                    cc4 cc4Var2 = s52Var.f60356n;
                    int i2 = ((C3776xy) s52Var.f60358p.f55593e).f68941f;
                    long jM22805J = uma.m22805J(jM22801F);
                    C3165jz c3165jz = ((tt5) cc4Var2.f9881a).f62846d1;
                    Handler handler = c3165jz.f46413a;
                    if (handler != null) {
                        handler.post(new RunnableC2982ez(c3165jz, i2, jM22805J, jElapsedRealtime, 0));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                n52 n52Var2 = (n52) obj;
                n52Var2.getClass();
                s52.f60314c0.getAndDecrement();
                cc4 cc4Var3 = n52Var2.f52359b.f60356n;
                if (cc4Var3 != null) {
                    C3776xy c3776xy = n52Var2.f52358a;
                    C3279kz c3279kz = new C3279kz(c3776xy.f68936a, c3776xy.f68937b, c3776xy.f68938c, c3776xy.f68941f, c3776xy.f68939d, c3776xy.f68940e);
                    C3165jz c3165jz2 = ((tt5) cc4Var3.f9881a).f62846d1;
                    Handler handler2 = c3165jz2.f46413a;
                    if (handler2 != null) {
                        handler2.post(new RunnableC3056gz(c3165jz2, c3279kz, 0));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                n52 n52Var3 = (n52) obj;
                s52 s52Var2 = n52Var3.f52359b;
                if (n52Var3 == s52Var2.f60352j && (cc4Var = s52Var2.f60356n) != null && s52Var2.f60329O && (mw2Var = ((tt5) cc4Var.f9881a).f68749d0) != null) {
                    mw2Var.m17064b();
                    return;
                }
                return;
            case 4:
                n52 n52Var4 = (n52) obj;
                s52 s52Var3 = n52Var4.f52359b;
                if (n52Var4 == s52Var3.f60352j && s52Var3.f60327M) {
                    s52Var3.f60328N = true;
                    return;
                }
                return;
            case 5:
                cc4 cc4Var4 = ((m52) obj).f50599a.f60356n;
                if (cc4Var4 != null) {
                    tt5 tt5Var = (tt5) cc4Var4.f9881a;
                    synchronized (tt5Var.f69495a) {
                        i92Var = tt5Var.f69494M;
                        break;
                    }
                    if (i92Var != null) {
                        synchronized (i92Var.f43729c) {
                            i92Var.f43732f.getClass();
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                ((InterfaceC3534rf) obj).getClass();
                return;
            case 16:
                ((InterfaceC3534rf) obj).getClass();
                return;
            case 17:
                ((InterfaceC3534rf) obj).getClass();
                return;
            case 18:
                ((InterfaceC3534rf) obj).getClass();
                return;
            case 19:
                ((InterfaceC3534rf) obj).getClass();
                return;
            case 20:
                ((InterfaceC3534rf) obj).getClass();
                return;
            case 21:
                ((InterfaceC3534rf) obj).getClass();
                return;
            case 22:
                ((InterfaceC3534rf) obj).getClass();
                return;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((InterfaceC3534rf) obj).getClass();
                return;
            case 24:
                ((InterfaceC3534rf) obj).getClass();
                return;
            case 25:
                ((InterfaceC3534rf) obj).getClass();
                return;
            case 26:
                ((InterfaceC3534rf) obj).getClass();
                return;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((InterfaceC3534rf) obj).getClass();
                return;
        }
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        view.getClass();
        l64 l64VarMo136i = f6bVar.f38536a.mo136i(519);
        l64VarMo136i.getClass();
        view.setPadding(view.getPaddingLeft(), l64VarMo136i.f49117b, view.getPaddingRight(), view.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = l64VarMo136i.f49119d;
        view.setLayoutParams(marginLayoutParams);
        return f6b.f38535b;
    }

    public /* synthetic */ hm2(int i) {
        this.f42605a = i;
    }

    public /* synthetic */ hm2(C3496qf c3496qf, eh5 eh5Var, ru5 ru5Var, int i) {
        this.f42605a = 24;
    }

    public /* synthetic */ hm2(C3496qf c3496qf, eh5 eh5Var, ru5 ru5Var, int i, byte b) {
        this.f42605a = i;
    }

    public /* synthetic */ hm2(C3496qf c3496qf, Object obj, int i) {
        this.f42605a = i;
    }

    public /* synthetic */ hm2(C3496qf c3496qf, boolean z, int i) {
        this.f42605a = 17;
    }
}
