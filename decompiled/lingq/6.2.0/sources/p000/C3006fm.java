package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import androidx.compose.foundation.C0121i;
import androidx.compose.foundation.lazy.grid.C0129b;
import androidx.compose.foundation.lazy.layout.C0139h;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.foundation.text.C0180h;
import androidx.compose.p002ui.layout.AbstractC0342i;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.library.LibraryTab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonDecodingException;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: renamed from: fm */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3006fm implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39273a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f39274b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f39275c;

    public /* synthetic */ C3006fm(y76 y76Var, d86 d86Var, qe3 qe3Var, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        this.f39273a = 9;
        this.f39274b = d86Var;
        this.f39275c = abstractComponentCallbacksC0635c;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069 A[LOOP:0: B:11:0x0034->B:21:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:273:0x006c A[SYNTHETIC] */
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        List listM22603U0;
        bb9 bb9VarM4491g;
        long jM12993a;
        String[] strArrNames;
        jp6 jp6Var = null;
        tw3VarArr = null;
        tw3[] tw3VarArr = null;
        int i = 0;
        switch (this.f39273a) {
            case 0:
                ((cu0) this.f39274b).mo4677k(this.f39275c);
                return xfa.f68157a;
            case 1:
                ((ke1) this.f39274b).f47086c = (ui3) this.f39275c;
                return xfa.f68157a;
            case 2:
                p70 p70Var = (p70) this.f39274b;
                C0358h c0358h = (C0358h) this.f39275c;
                p70Var.f55684R = p70Var.f55679M.mo12726b(c0358h.f4358a.mo1422h(), c0358h.getLayoutDirection(), c0358h);
                return xfa.f68157a;
            case 3:
                vv9 vv9Var = (vv9) this.f39274b;
                t66 t66Var = (t66) this.f39275c;
                if (!cx9.m9920b(vv9Var.f65991b, ((vv9) t66Var.getValue()).f65991b) || !fa4.m11650l(vv9Var.f65992c, ((vv9) t66Var.getValue()).f65992c)) {
                    t66Var.setValue(vv9Var);
                }
                return xfa.f68157a;
            case 4:
                C0180h c0180h = (C0180h) this.f39274b;
                C3419on c3419on = (C3419on) this.f39275c;
                if (c0180h == null) {
                    return c3419on;
                }
                SnapshotStateList snapshotStateList = c0180h.f2909c;
                boolean zIsEmpty = snapshotStateList.isEmpty();
                C3419on c3419on2 = c0180h.f2908b;
                if (!zIsEmpty) {
                    rs9 rs9Var = new rs9(c3419on2);
                    int size = snapshotStateList.size();
                    while (i < size) {
                        ((vi3) snapshotStateList.get(i)).invoke(rs9Var);
                        i++;
                    }
                    c3419on2 = rs9Var.f59768b;
                }
                c0180h.f2908b = c3419on2;
                return c3419on2 == null ? c3419on : c3419on2;
            case 5:
                nf1 nf1Var = (nf1) this.f39274b;
                Object obj = this.f39275c;
                tj3 tj3Var = nf1Var.f52670a;
                cb9 cb9Var = tj3Var.f62389c;
                bb9 bb9VarM4491g2 = cb9Var.m4491g();
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 < cb9Var.f9843b) {
                            if (bb9VarM4491g2.m3568l(i2)) {
                                Object objM3570n = bb9VarM4491g2.m3570n(i2);
                                if (objM3570n != obj) {
                                    xj3 xj3Var = objM3570n instanceof xj3 ? (xj3) objM3570n : null;
                                    if ((xj3Var != null ? xj3Var.f68286a : null) == obj) {
                                    }
                                }
                                jp6 jp6Var2 = new jp6(i2, null);
                                bb9VarM4491g2.m3559c();
                                jp6Var = jp6Var2;
                                if (jp6Var != null) {
                                    int i3 = jp6Var.f45962a;
                                    Integer num = jp6Var.f45963b;
                                    bb9VarM4491g = cb9Var.m4491g();
                                    try {
                                        ArrayList arrayListM16114N = lda.m16114N(bb9VarM4491g, i3, num);
                                        bb9VarM4491g.m3559c();
                                        listM22603U0 = u91.m22603U0(tj3Var.m22090H(), arrayListM16114N);
                                    } catch (Throwable th) {
                                        bb9VarM4491g.m3559c();
                                        throw th;
                                    }
                                } else {
                                    listM22603U0 = EmptyList.f47638a;
                                }
                                return new qe1(listM22603U0, tj3Var.f62368C);
                            }
                            int[] iArr = bb9VarM4491g2.f8283b;
                            int i4 = i2 + 1;
                            int iM11011b = (i4 < bb9VarM4491g2.f8284c ? iArr[(i4 * 5) + 4] : bb9VarM4491g2.f8286e) - eb9.m11011b(iArr, i2);
                            int i5 = 0;
                            while (true) {
                                if (i5 >= iM11011b) {
                                    i2 = i4;
                                } else {
                                    Object objM3564h = bb9VarM4491g2.m3564h(i2, i5);
                                    if (objM3564h != obj) {
                                        xj3 xj3Var2 = objM3564h instanceof xj3 ? (xj3) objM3564h : null;
                                        if ((xj3Var2 != null ? xj3Var2.f68286a : null) != obj) {
                                            i5++;
                                        }
                                    }
                                    jp6Var = new jp6(i2, Integer.valueOf(i5));
                                }
                            }
                        }
                        bb9VarM4491g2.m3559c();
                        if (jp6Var != null) {
                            int i6 = jp6Var.f45962a;
                            Integer num2 = jp6Var.f45963b;
                            bb9VarM4491g = cb9Var.m4491g();
                            ArrayList arrayListM16114N2 = lda.m16114N(bb9VarM4491g, i6, num2);
                            bb9VarM4491g.m3559c();
                            listM22603U0 = u91.m22603U0(tj3Var.m22090H(), arrayListM16114N2);
                        } else {
                            listM22603U0 = EmptyList.f47638a;
                        }
                        return new qe1(listM22603U0, tj3Var.f62368C);
                    } catch (Throwable th2) {
                        bb9VarM4491g2.m3559c();
                        throw th2;
                    }
                }
            case 6:
                ((ConnectivityManager) this.f39274b).unregisterNetworkCallback((oi1) this.f39275c);
                return xfa.f68157a;
            case 7:
                zs2 zs2Var = (zs2) this.f39274b;
                String str = (String) this.f39275c;
                Enum[] enumArr = zs2Var.f72034a;
                xs2 xs2Var = new xs2(str, enumArr.length);
                for (Enum r0 : enumArr) {
                    xs2Var.m3702k(r0.name(), false);
                }
                return xs2Var;
            case 8:
                ((Ref$ObjectRef) this.f39274b).f47718a = thb.m22050i((C0121i) this.f39275c, AbstractC0342i.f4215a);
                return xfa.f68157a;
            case 9:
                d86 d86Var = (d86) this.f39274b;
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) this.f39275c;
                for (y76 y76Var : (Iterable) ((C3244l) d86Var.f35169f.f9311a).getValue()) {
                    if (qe3.m19892n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + y76Var + " due to fragment " + abstractComponentCallbacksC0635c + " viewmodel being cleared");
                    }
                    d86Var.m10155c(y76Var);
                }
                return xfa.f68157a;
            case 10:
                mw3 mw3Var = (mw3) this.f39274b;
                tw3 tw3Var = (tw3) this.f39275c;
                try {
                    mw3Var.f51926a.mo14267b(tw3Var);
                    break;
                } catch (IOException e) {
                    C2927dg c2927dg = u87.f63590a;
                    C2927dg c2927dg2 = u87.f63590a;
                    String str2 = "Http2Connection.Listener failure for " + mw3Var.f51928c;
                    c2927dg2.getClass();
                    Log.i("OkHttp", str2, e);
                    try {
                        tw3Var.m22319d(ErrorCode.PROTOCOL_ERROR, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return xfa.f68157a;
            case 11:
                m92 m92Var = (m92) this.f39274b;
                h09 h09Var = (h09) this.f39275c;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                mw3 mw3Var2 = (mw3) m92Var.f50810c;
                synchronized (mw3Var2.f51923R) {
                    synchronized (mw3Var2) {
                        try {
                            h09 h09Var2 = mw3Var2.f51918M;
                            h09 h09Var3 = new h09();
                            h09Var2.getClass();
                            for (int i7 = 0; i7 < 10; i7++) {
                                if (((1 << i7) & h09Var2.f41639a) != 0) {
                                    h09Var3.m12994b(i7, h09Var2.f41640b[i7]);
                                }
                            }
                            for (int i8 = 0; i8 < 10; i8++) {
                                if (((1 << i8) & h09Var.f41639a) != 0) {
                                    h09Var3.m12994b(i8, h09Var.f41640b[i8]);
                                }
                            }
                            ref$ObjectRef.f47718a = h09Var3;
                            jM12993a = ((long) h09Var3.m12993a()) - ((long) h09Var2.m12993a());
                            if (jM12993a != 0 && !mw3Var2.f51927b.isEmpty()) {
                                tw3VarArr = (tw3[]) mw3Var2.f51927b.values().toArray(new tw3[0]);
                            }
                            h09 h09Var4 = (h09) ref$ObjectRef.f47718a;
                            h09Var4.getClass();
                            mw3Var2.f51918M = h09Var4;
                            zr9.m25750b(mw3Var2.f51935j, mw3Var2.f51928c + " onSettings", new C3006fm(12, mw3Var2, ref$ObjectRef));
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    try {
                        mw3Var2.f51923R.m22960a((h09) ref$ObjectRef.f47718a);
                    } catch (IOException e2) {
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        mw3Var2.m17065a(errorCode, errorCode, e2);
                    }
                    break;
                }
                if (tw3VarArr != null) {
                    int length = tw3VarArr.length;
                    while (i < length) {
                        tw3 tw3Var2 = tw3VarArr[i];
                        synchronized (tw3Var2) {
                            tw3Var2.f62998e += jM12993a;
                            if (jM12993a > 0) {
                                tw3Var2.notifyAll();
                            }
                            break;
                        }
                        i++;
                    }
                }
                return xfa.f68157a;
            case 12:
                mw3 mw3Var3 = (mw3) this.f39274b;
                mw3Var3.f51926a.mo14266a(mw3Var3, (h09) ((Ref$ObjectRef) this.f39275c).f47718a);
                return xfa.f68157a;
            case 13:
                SerialDescriptor serialDescriptor = (SerialDescriptor) this.f39274b;
                df4 df4Var = (df4) this.f39275c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                kf4 kf4Var = df4Var.f35560a;
                AbstractC3695vr.m23483A(df4Var, serialDescriptor);
                int iMo3697e = serialDescriptor.mo3697e();
                for (int i9 = 0; i9 < iMo3697e; i9++) {
                    List listMo3699h = serialDescriptor.mo3699h(i9);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listMo3699h) {
                        if (obj2 instanceof bg4) {
                            arrayList.add(obj2);
                        }
                    }
                    bg4 bg4Var = (bg4) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (bg4Var != null && (strArrNames = bg4Var.names()) != null) {
                        for (String str3 : strArrNames) {
                            String str4 = fa4.m11650l(serialDescriptor.getKind(), dy8.f36425y) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str3)) {
                                String str5 = "The suggested name '" + str3 + "' for " + str4 + ' ' + serialDescriptor.mo3698f(i9) + " is already one of the names for " + str4 + ' ' + serialDescriptor.mo3698f(((Number) AbstractC3194a.m15361N(str3, linkedHashMap)).intValue()) + " in " + serialDescriptor;
                                throw new JsonDecodingException(fa4.m11656r(-1, str5, null, null, null), str5);
                            }
                            linkedHashMap.put(str3, Integer.valueOf(i9));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? AbstractC3194a.m15360M() : linkedHashMap;
            case 14:
                gc2 gc2Var = (gc2) this.f39274b;
                C0129b c0129b = (C0129b) this.f39275c;
                js4 js4Var = (js4) gc2Var.getValue();
                return new ls4(c0129b, js4Var, new C0139h((i84) c0129b.f2471d.f67249f.getValue(), js4Var));
            case 15:
                gc2 gc2Var2 = (gc2) this.f39274b;
                AbstractC0150d abstractC0150d = (AbstractC0150d) this.f39275c;
                k27 k27Var = (k27) gc2Var2.getValue();
                return new l27(abstractC0150d, k27Var, new C0139h((i84) ((eu4) abstractC0150d.f2674d.f63127f).getValue(), k27Var));
            case 16:
                return new ov4((il8) this.f39274b, AbstractC3194a.m15360M(), (gl8) this.f39275c);
            case 17:
                gc2 gc2Var3 = (gc2) this.f39274b;
                C0144d c0144d = (C0144d) this.f39275c;
                tv4 tv4Var = (tv4) gc2Var3.getValue();
                return new uv4(c0144d, tv4Var, new C0139h((i84) ((eu4) c0144d.f2600c.f71355h).getValue(), tv4Var));
            case 18:
                ((vi3) this.f39274b).invoke((LibraryTab) this.f39275c);
                return xfa.f68157a;
            case 19:
                ((b85) this.f39274b).mo3466s(((r59) this.f39275c).f58778b);
                return xfa.f68157a;
            case 20:
                ((b85) this.f39274b).mo3446Z(((w59) this.f39275c).m23766b(), true);
                return xfa.f68157a;
            case 21:
                ((b85) this.f39274b).mo3440T(((s59) this.f39275c).m21124b());
                return xfa.f68157a;
            case 22:
                ((b85) this.f39274b).mo3428H(((u59) this.f39275c).m22482b());
                return xfa.f68157a;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                b85 b85Var = (b85) this.f39274b;
                s45 s45Var = ((t59) this.f39275c).f61885b;
                b85Var.mo3455h(s45Var, new LqAnalyticsValues$LessonPath.Feed(s45Var.f60278h));
                return xfa.f68157a;
            case 24:
                d86 d86Var2 = (d86) this.f39274b;
                y76 y76Var2 = (y76) this.f39275c;
                synchronized (d86Var2.f35164a) {
                    try {
                        C3244l c3244l = d86Var2.f35165b;
                        Iterable iterable = (Iterable) c3244l.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : iterable) {
                            if (fa4.m11650l((y76) obj3, y76Var2)) {
                                c3244l.getClass();
                                c3244l.m15572j(null, arrayList2);
                            } else {
                                arrayList2.add(obj3);
                            }
                        }
                        c3244l.getClass();
                        c3244l.m15572j(null, arrayList2);
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return xfa.f68157a;
            case 25:
                ((vi3) this.f39274b).invoke(((bk5) ((t66) this.f39275c).getValue()).f8640f);
                return xfa.f68157a;
            case 26:
                return PreferenceDataStoreSingletonDelegate.getValue$lambda$0$0((Context) this.f39274b, (PreferenceDataStoreSingletonDelegate) this.f39275c);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                o66 o66Var = (o66) this.f39274b;
                pf1 pf1Var = (pf1) this.f39275c;
                Object[] objArr = o66Var.f1303b;
                long[] jArr = o66Var.f1302a;
                int length2 = jArr.length - 2;
                if (length2 >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j = jArr[i10];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j) < 128) {
                                    pf1Var.m19110z(objArr[(i10 << 3) + i12]);
                                }
                                j >>= 8;
                            }
                            if (i11 == 8) {
                                if (i10 != length2) {
                                    i10++;
                                }
                            }
                        } else if (i10 != length2) {
                            i10++;
                        }
                    }
                }
                return xfa.f68157a;
            case 28:
                return ((Regex) this.f39274b).m15424b((CharSequence) this.f39275c);
            default:
                return SharedPreferencesMigration._init_$lambda$0((Context) this.f39274b, (String) this.f39275c);
        }
    }

    public /* synthetic */ C3006fm(int i, Object obj, Object obj2) {
        this.f39273a = i;
        this.f39274b = obj;
        this.f39275c = obj2;
    }

    public /* synthetic */ C3006fm(d86 d86Var, y76 y76Var, boolean z) {
        this.f39273a = 24;
        this.f39274b = d86Var;
        this.f39275c = y76Var;
    }
}
