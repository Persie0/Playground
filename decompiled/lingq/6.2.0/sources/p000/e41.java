package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.IOException;
import java.security.Provider;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes.dex */
public class e41 implements zc1, jn1, InterfaceC3624tu, InterfaceC3735wu, b9a, jl1, ns2, jg9, vt2, dqb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36688a;

    /* JADX INFO: renamed from: b */
    public static final C3335mh f36677b = new C3335mh(0);

    /* JADX INFO: renamed from: c */
    public static final C3335mh f36678c = new C3335mh(1);

    /* JADX INFO: renamed from: d */
    public static final C3335mh f36679d = new C3335mh(2);

    /* JADX INFO: renamed from: e */
    public static final e41 f36680e = new e41(2);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ e41 f36681f = new e41(3);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ e41 f36682g = new e41(4);

    /* JADX INFO: renamed from: h */
    public static final e41 f36683h = new e41(5);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ e41 f36684i = new e41(18);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ e41 f36685j = new e41(19);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ e41 f36686k = new e41(20);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ e41 f36687l = new e41(21);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ e41 f36670H = new e41(22);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ e41 f36671I = new e41(23);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ e41 f36672J = new e41(24);

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ e41 f36673K = new e41(25);

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ e41 f36674L = new e41(26);

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ e41 f36675M = new e41(27);

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ e41 f36676N = new e41(28);

    public e41() {
        this.f36688a = 17;
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: g */
    public static Font m10835g(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM10836m = m10836m(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM10836m2 = m10836m(fontStyle, font2.getStyle());
            if (iM10836m2 < iM10836m) {
                font = font2;
                iM10836m = iM10836m2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: m */
    public static int m10836m(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p000.InterfaceC3624tu
    /* JADX INFO: renamed from: a */
    public float mo9967a() {
        return 0.0f;
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: b */
    public long mo10837b(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        int i = km8.f47515a;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // p000.jg9
    /* JADX INFO: renamed from: c */
    public StackTraceElement[] mo3847c(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i5 = i2 - iIntValue;
            if (i2 + i5 <= stackTraceElementArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        int iIntValue2 = i2 - num.intValue();
                        if (i4 < 10) {
                            System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, iIntValue2);
                            i3 += iIntValue2;
                            i4++;
                        }
                        i = (iIntValue2 - 1) + i2;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                        i3++;
                        i4 = 1;
                        i = i2;
                        break;
                        break;
                    }
                    i6++;
                }
            } else {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // p000.ns2
    /* JADX INFO: renamed from: d */
    public Object mo10838d(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    /* JADX INFO: renamed from: e */
    public ku5 m10839e() {
        return new ku5(this);
    }

    /* JADX INFO: renamed from: f */
    public Typeface m10840f(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM10841h = m10841h((dc3[]) list.get(0), contentResolver);
            if (fontFamilyM10841h == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM10841h);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyM10841h2 = m10841h((dc3[]) list.get(i2), contentResolver);
                if (fontFamilyM10841h2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM10841h2);
                }
            }
            return customFallbackBuilder.setStyle(m10835g(fontFamilyM10841h, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public FontFamily m10841h(dc3[] dc3VarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (dc3 dc3Var : dc3VarArr) {
            if (dc3Var.m10283g()) {
                fontBuild = mo10842i(dc3Var);
            } else {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(dc3Var.m10279c(), "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(dc3Var.m10281e()).setSlant(dc3Var.m10282f() ? 1 : 0).setTtcIndex(dc3Var.m10278b());
                            if (!TextUtils.isEmpty(dc3Var.m10280d())) {
                                ttcIndex.setFontVariationSettings(dc3Var.m10280d());
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: i */
    public Font mo10842i(dc3 dc3Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // p000.InterfaceC3624tu
    /* JADX INFO: renamed from: j */
    public void mo9968j(fb2 fb2Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            eh0.m11109F(i, iArr, iArr2, false);
        } else {
            eh0.m11109F(i, iArr, iArr2, true);
        }
    }

    @Override // p000.InterfaceC3735wu
    /* JADX INFO: renamed from: k */
    public void mo10843k(fb2 fb2Var, int i, int[] iArr, int[] iArr2) {
        eh0.m11109F(i, iArr, iArr2, false);
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        Object objMo4932g = co7Var.mo4932g(new rp7(td0.class, Executor.class));
        objMo4932g.getClass();
        return bna.m3926O((Executor) objMo4932g);
    }

    public String toString() {
        switch (this.f36688a) {
            case 7:
                return "Arrangement#Center";
            case 16:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // p000.dqb
    public Object zza() {
        switch (this.f36688a) {
            case 19:
                ((dkb) akb.f784b.f785a.get()).getClass();
                return new Boolean(((Boolean) dkb.f35755b.get()).booleanValue());
            case 20:
                List list = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.upload.max_realtime_events_per_day", 74, 10L).get()).longValue());
            case 21:
                List list2 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.sgtm.upload.max_queued_batches", 47, 5000L).get()).longValue());
            case 22:
                List list3 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.alarm_manager.minimum_interval", 27, 60000L).get();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List list4 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.service_client.reconnect_millis", 38, 1000L).get();
            case 24:
                List list5 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.sdk.attribution.cache.ttl", 61, 604800000L).get();
            case 25:
                List list6 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.rb.attribution.query_parameters_to_remove", 59, "").get();
            case 26:
                List list7 = z8c.f71153a;
                ((nkb) mkb.f51455b.f51456a.get()).getClass();
                return (Boolean) nkb.f52895b.get();
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                List list8 = z8c.f71153a;
                ((olb) nlb.f52936b.f52937a.get()).getClass();
                return (Boolean) olb.f54559a.get();
            default:
                ((rkb) qkb.f57881b.f57882a.get()).getClass();
                return new Boolean(((Boolean) rkb.f59450a.get()).booleanValue());
        }
    }

    public /* synthetic */ e41(int i) {
        this.f36688a = i;
    }
}
