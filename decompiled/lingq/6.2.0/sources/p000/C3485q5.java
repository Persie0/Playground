package p000;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.text.StaticLayout;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.C0223c;
import androidx.compose.material3.C0252k0;
import androidx.compose.material3.C0253l;
import androidx.compose.material3.internal.AnchoredDraggableUninitializedException;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.glance.appwidget.protobuf.ByteString;
import androidx.lifecycle.Lifecycle$Event;
import com.lingq.core.database.dao.C1315c;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.entity.ChatHistoryEntity;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.p012ui.highlightedtext.AbstractC1932c;
import com.lingq.feature.challenges.cup.data.CupPhase;
import com.lingq.p020ui.C2889e;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.text.Regex;
import p000.wfb;

/* JADX INFO: renamed from: q5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3485q5 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f57276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f57277c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f57278d;

    public /* synthetic */ C3485q5(int i, vi3 vi3Var, Object obj, String str) {
        this.f57275a = i;
        this.f57277c = vi3Var;
        this.f57276b = str;
        this.f57278d = obj;
    }

    /* JADX INFO: renamed from: d */
    private final Object m19656d(Object obj) {
        String str = (String) this.f57276b;
        C0253l c0253l = (C0253l) this.f57277c;
        un1 un1Var = (un1) this.f57278d;
        tv8 tv8Var = (tv8) obj;
        AbstractC0426f.m1861e(tv8Var, str);
        if (c0253l.m1182c()) {
            tv8Var.mo3709d(AbstractC0421a.f4966v, new C3024g3(null, new C0223c(c0253l, un1Var, 1)));
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    private final Object m19657g(Object obj) {
        Context context = (Context) this.f57276b;
        AbstractC3423or.m18247c0(context, (Bitmap) obj, ss5.m21682G(((ty1) this.f57277c).f63087a, context, ((C2889e) this.f57278d).f34200b.mo4589b2()));
        return xfa.f68157a;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        long jFloatToRawIntBits;
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        int i3 = this.f57275a;
        int i4 = 16;
        int i5 = 4;
        final int i6 = 3;
        final int i7 = 2;
        C0282a c0282a = null;
        final int i8 = 0;
        int i9 = 0;
        boolean z = false;
        xfa xfaVar = xfa.f68157a;
        final int i10 = 1;
        Object obj2 = this.f57278d;
        Object obj3 = this.f57277c;
        Object obj4 = this.f57276b;
        switch (i3) {
            case 0:
                br4 br4Var = (br4) obj;
                int i11 = ActionCallbackBroadcastReceiver.f5981a;
                kr4 kr4VarM16474u = lr4.m16474u();
                kr4VarM16474u.m23361c();
                lr4.m16470n((lr4) kr4VarM16474u.f65532b, (String) obj4);
                int i12 = ((C0785at) obj3).f7451a;
                kr4VarM16474u.m23361c();
                lr4.m16471o((lr4) kr4VarM16474u.f65532b, i12);
                Map mapUnmodifiableMap = Collections.unmodifiableMap(((o56) obj2).f53865a);
                ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
                for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                    arrayList.add(new Pair(((C2953e6) entry.getKey()).f36732a, entry.getValue()));
                }
                Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                Bundle bundleM18160p = omd.m18160p(new Pair("ActionCallbackBroadcastReceiver:parameters", omd.m18160p((Pair[]) Arrays.copyOf(pairArr, pairArr.length))));
                Parcel parcelObtain = Parcel.obtain();
                bundleM18160p.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ByteString byteStringM2261g = ByteString.m2261g(bArrMarshall, 0, bArrMarshall.length);
                kr4VarM16474u.m23361c();
                lr4.m16472p((lr4) kr4VarM16474u.f65532b, byteStringM2261g);
                lr4 lr4Var = (lr4) kr4VarM16474u.m23359a();
                br4Var.m23361c();
                or4.m18317r((or4) br4Var.f65532b, lr4Var);
                return xfaVar;
            case 1:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                l7a l7aVar = (l7a) obj3;
                C3838zm c3838zm = (C3838zm) obj;
                float fFloatValue = ((Number) ((xc9) c3838zm.f71729e).getValue()).floatValue() - ref$FloatRef.f47715a;
                float fM19861h = l7aVar.f49259d.m19861h();
                l7aVar.m15983f(fM19861h + fFloatValue);
                float fAbs = Math.abs(fM19861h - l7aVar.f49259d.m19861h());
                ref$FloatRef.f47715a = ((Number) ((xc9) c3838zm.f71729e).getValue()).floatValue();
                ((Ref$FloatRef) obj2).f47715a = ((Number) c3838zm.m25699b()).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    c3838zm.m25698a();
                }
                return xfaVar;
            case 2:
                final un1 un1Var = (un1) obj3;
                final C0252k0 c0252k0 = (C0252k0) obj2;
                ui3 ui3Var = new ui3() { // from class: androidx.compose.material3.internal.c
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        wfb.m23926u(un1Var, null, null, new BasicTooltipKt$anchorSemantics$1$1$1(c0252k0, null), 3);
                        return Boolean.TRUE;
                    }
                };
                bh4[] bh4VarArr = AbstractC0426f.f5022a;
                ((tv8) obj).mo3709d(AbstractC0421a.f4947c, new C3024g3((String) obj4, ui3Var));
                return xfaVar;
            case 3:
                e28 e28Var = (e28) obj3;
                float f = e28Var.f36621b;
                float f2 = e28Var.f36623d;
                float f3 = e28Var.f36620a;
                float f4 = e28Var.f36622c;
                vi0 vi0Var = (vi0) obj2;
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                gj9 gj9Var = (gj9) ((w41) obj4).f66366b;
                gj9Var.getClass();
                float fFloatValue2 = Float.valueOf(gj9Var.f40881b).floatValue();
                float f5 = fFloatValue2 < 0.0f ? 0.0f : fFloatValue2;
                i8 = f5 * 2.0f > Math.min(Math.abs(f4 - f3), Math.abs(f2 - f)) ? 1 : 0;
                if (i8 != 0) {
                    jFloatToRawIntBits = e28Var.m10805f();
                } else {
                    float f6 = f5 / 2.0f;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3 + f6)) << 32) | (((long) Float.floatToRawIntBits(f6 + f)) & 4294967295L);
                }
                InterfaceC0310a.m1418s0(interfaceC0310a, vi0Var, jFloatToRawIntBits, i8 != 0 ? e28Var.m10804e() : (((long) Float.floatToRawIntBits((f2 - f) - f5)) & 4294967295L) | (((long) Float.floatToRawIntBits((f4 - f3) - f5)) << 32), 0.0f, i8 != 0 ? w33.f66328a : new el9(f5, 0.0f, 0, 0, 30), null, 0, 104);
                return xfaVar;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj3;
                C1315c c1315c = (C1315c) obj2;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0((String) obj4);
                try {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ik8VarMo2873e0.mo2878j(i10, ((Number) it.next()).intValue());
                        i10++;
                    }
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "title");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "image");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "coins");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "targetLanguage");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "dictionaryLanguage");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "startedAt");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "updatedAt");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "history");
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList3.add(new ChatHistoryEntity((int) ik8VarMo2873e0.getLong(iM14108v), ik8VarMo2873e0.mo2875L(iM14108v2), ik8VarMo2873e0.mo2875L(iM14108v3), ik8VarMo2873e0.getDouble(iM14108v4), ik8VarMo2873e0.mo2875L(iM14108v5), ik8VarMo2873e0.mo2875L(iM14108v6), ik8VarMo2873e0.mo2875L(iM14108v7), ik8VarMo2873e0.mo2875L(iM14108v8), c1315c.f17003M.m20054I(ik8VarMo2873e0.mo2875L(iM14108v9))));
                        break;
                    }
                    return arrayList3;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 5:
                List list = (List) obj4;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                vu4.m23546i(vu4Var, list.size(), null, new C0282a(2007778256, true, new dw0(list, (nz9) obj3, (fw0) obj2, i8)), 6);
                return xfaVar;
            case 6:
                ia4 ia4Var = (ia4) obj;
                ia4Var.getClass();
                ((jv0) obj4).mo8886m();
                ((t66) obj3).setValue(ia4Var);
                ((t66) obj2).setValue(Boolean.TRUE);
                return xfaVar;
            case 7:
                jv0 jv0Var = (jv0) obj4;
                tx0 tx0Var = (tx0) obj3;
                oz0 oz0Var = (oz0) obj;
                oz0Var.getClass();
                if (((Boolean) ((t66) obj2).getValue()).booleanValue()) {
                    jv0Var.mo8871E(tx0Var.f63041f, oz0Var.f55317b);
                }
                return xfaVar;
            case 8:
                final t61 t61Var = (t61) obj4;
                vi3 vi3Var = (vi3) obj3;
                final vi3 vi3Var2 = (vi3) obj2;
                vu4 vu4Var2 = (vu4) obj;
                vu4Var2.getClass();
                vu4.m23545g(vu4Var2, null, new C0282a(1481912831, true, new se0(t61Var, 5)), 3);
                vu4.m23545g(vu4Var2, null, new C0282a(835826344, true, new qe0(vi3Var, i7)), 3);
                vu4.m23545g(vu4Var2, null, new C0282a(176760263, true, new qe0(vi3Var, i6)), 3);
                vu4.m23545g(vu4Var2, null, new C0282a(-482305818, true, new aj3() { // from class: o61
                    @Override // p000.aj3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i13 = i8;
                        xfa xfaVar2 = xfa.f68157a;
                        p84 p84Var = we1.f66679a;
                        b16 b16Var = b16.f7762a;
                        vi3 vi3Var3 = vi3Var2;
                        final t61 t61Var2 = t61Var;
                        final int i14 = 0;
                        final int i15 = 1;
                        switch (i13) {
                            case 0:
                                ye1 ye1Var = (ye1) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                ((ft4) obj5).getClass();
                                tj3 tj3Var = (tj3) ye1Var;
                                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    tj3Var.m22102U();
                                } else {
                                    int i16 = t61Var2.f61903f ? R$string.lingq_likes_past : R$string.lingq_like_present;
                                    boolean zM22120g = tj3Var.m22120g(vi3Var3);
                                    Object objM22097O = tj3Var.m22097O();
                                    if (zM22120g || objM22097O == p84Var) {
                                        objM22097O = new C3353mz(vi3Var3, 15);
                                        tj3Var.m22131l0(objM22097O);
                                    }
                                    of5.m17959a(ci8.m4703P(1624384712, new ex0(i16, 2), tj3Var), AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), ci8.m4703P(-2029292732, new zi3() { // from class: n61
                                        @Override // p000.zi3
                                        public final Object invoke(Object obj8, Object obj9) {
                                            int i17 = i15;
                                            xfa xfaVar3 = xfa.f68157a;
                                            b16 b16Var2 = b16.f7762a;
                                            t61 t61Var3 = t61Var2;
                                            switch (i17) {
                                                case 0:
                                                    ye1 ye1Var2 = (ye1) obj8;
                                                    int iIntValue2 = ((Integer) obj9).intValue();
                                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                                    if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                                        tj3Var2.m22102U();
                                                    } else {
                                                        y27 y27VarM18236U = AbstractC3423or.m18236U(t61Var3.f61908k ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var2, 0);
                                                        ((fe9) tj3Var2.m22128k(ge9.f40637a)).getClass();
                                                        ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var2, 56, 8);
                                                    }
                                                    break;
                                                default:
                                                    ye1 ye1Var3 = (ye1) obj8;
                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                                    if (!tj3Var3.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                        tj3Var3.m22102U();
                                                    } else {
                                                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(t61Var3.f61903f ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var3, 0);
                                                        ((fe9) tj3Var3.m22128k(ge9.f40637a)).getClass();
                                                        ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var3, 56, 8);
                                                    }
                                                    break;
                                            }
                                            return xfaVar3;
                                        }
                                    }, tj3Var), null, tj3Var, 24582, 492);
                                }
                                break;
                            default:
                                ye1 ye1Var2 = (ye1) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                ((ft4) obj5).getClass();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    int i17 = t61Var2.f61908k ? R$string.course_unsubscribe : R$string.course_subscribe;
                                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var3);
                                    Object objM22097O2 = tj3Var2.m22097O();
                                    if (zM22120g2 || objM22097O2 == p84Var) {
                                        objM22097O2 = new C3353mz(vi3Var3, 11);
                                        tj3Var2.m22131l0(objM22097O2);
                                    }
                                    of5.m17959a(ci8.m4703P(-794262810, new ex0(i17, i15), tj3Var2), AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), ci8.m4703P(1490654562, new zi3() { // from class: n61
                                        @Override // p000.zi3
                                        public final Object invoke(Object obj8, Object obj9) {
                                            int i18 = i14;
                                            xfa xfaVar3 = xfa.f68157a;
                                            b16 b16Var2 = b16.f7762a;
                                            t61 t61Var3 = t61Var2;
                                            switch (i18) {
                                                case 0:
                                                    ye1 ye1Var3 = (ye1) obj8;
                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                                    if (!tj3Var3.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                        tj3Var3.m22102U();
                                                    } else {
                                                        y27 y27VarM18236U = AbstractC3423or.m18236U(t61Var3.f61908k ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var3, 0);
                                                        ((fe9) tj3Var3.m22128k(ge9.f40637a)).getClass();
                                                        ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var3, 56, 8);
                                                    }
                                                    break;
                                                default:
                                                    ye1 ye1Var4 = (ye1) obj8;
                                                    int iIntValue4 = ((Integer) obj9).intValue();
                                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                                    if (!tj3Var4.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                                        tj3Var4.m22102U();
                                                    } else {
                                                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(t61Var3.f61903f ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var4, 0);
                                                        ((fe9) tj3Var4.m22128k(ge9.f40637a)).getClass();
                                                        ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var4, 56, 8);
                                                    }
                                                    break;
                                            }
                                            return xfaVar3;
                                        }
                                    }, tj3Var2), null, tj3Var2, 24582, 492);
                                }
                                break;
                        }
                        return xfaVar2;
                    }
                }), 3);
                if (t61Var.f61907j) {
                    vu4.m23545g(vu4Var2, null, new C0282a(1734867204, true, new aj3() { // from class: o61
                        @Override // p000.aj3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i13 = i10;
                            xfa xfaVar2 = xfa.f68157a;
                            p84 p84Var = we1.f66679a;
                            b16 b16Var = b16.f7762a;
                            vi3 vi3Var3 = vi3Var2;
                            final t61 t61Var2 = t61Var;
                            final int i14 = 0;
                            final int i15 = 1;
                            switch (i13) {
                                case 0:
                                    ye1 ye1Var = (ye1) obj6;
                                    int iIntValue = ((Integer) obj7).intValue();
                                    ((ft4) obj5).getClass();
                                    tj3 tj3Var = (tj3) ye1Var;
                                    if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var.m22102U();
                                    } else {
                                        int i16 = t61Var2.f61903f ? R$string.lingq_likes_past : R$string.lingq_like_present;
                                        boolean zM22120g = tj3Var.m22120g(vi3Var3);
                                        Object objM22097O = tj3Var.m22097O();
                                        if (zM22120g || objM22097O == p84Var) {
                                            objM22097O = new C3353mz(vi3Var3, 15);
                                            tj3Var.m22131l0(objM22097O);
                                        }
                                        of5.m17959a(ci8.m4703P(1624384712, new ex0(i16, 2), tj3Var), AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), ci8.m4703P(-2029292732, new zi3() { // from class: n61
                                            @Override // p000.zi3
                                            public final Object invoke(Object obj8, Object obj9) {
                                                int i18 = i15;
                                                xfa xfaVar3 = xfa.f68157a;
                                                b16 b16Var2 = b16.f7762a;
                                                t61 t61Var3 = t61Var2;
                                                switch (i18) {
                                                    case 0:
                                                        ye1 ye1Var3 = (ye1) obj8;
                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                                        if (!tj3Var3.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                            tj3Var3.m22102U();
                                                        } else {
                                                            y27 y27VarM18236U = AbstractC3423or.m18236U(t61Var3.f61908k ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var3, 0);
                                                            ((fe9) tj3Var3.m22128k(ge9.f40637a)).getClass();
                                                            ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var3, 56, 8);
                                                        }
                                                        break;
                                                    default:
                                                        ye1 ye1Var4 = (ye1) obj8;
                                                        int iIntValue4 = ((Integer) obj9).intValue();
                                                        tj3 tj3Var4 = (tj3) ye1Var4;
                                                        if (!tj3Var4.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                                            tj3Var4.m22102U();
                                                        } else {
                                                            y27 y27VarM18236U2 = AbstractC3423or.m18236U(t61Var3.f61903f ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var4, 0);
                                                            ((fe9) tj3Var4.m22128k(ge9.f40637a)).getClass();
                                                            ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var4, 56, 8);
                                                        }
                                                        break;
                                                }
                                                return xfaVar3;
                                            }
                                        }, tj3Var), null, tj3Var, 24582, 492);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var2 = (ye1) obj6;
                                    int iIntValue2 = ((Integer) obj7).intValue();
                                    ((ft4) obj5).getClass();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        int i17 = t61Var2.f61908k ? R$string.course_unsubscribe : R$string.course_subscribe;
                                        boolean zM22120g2 = tj3Var2.m22120g(vi3Var3);
                                        Object objM22097O2 = tj3Var2.m22097O();
                                        if (zM22120g2 || objM22097O2 == p84Var) {
                                            objM22097O2 = new C3353mz(vi3Var3, 11);
                                            tj3Var2.m22131l0(objM22097O2);
                                        }
                                        of5.m17959a(ci8.m4703P(-794262810, new ex0(i17, i15), tj3Var2), AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), ci8.m4703P(1490654562, new zi3() { // from class: n61
                                            @Override // p000.zi3
                                            public final Object invoke(Object obj8, Object obj9) {
                                                int i18 = i14;
                                                xfa xfaVar3 = xfa.f68157a;
                                                b16 b16Var2 = b16.f7762a;
                                                t61 t61Var3 = t61Var2;
                                                switch (i18) {
                                                    case 0:
                                                        ye1 ye1Var3 = (ye1) obj8;
                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                                        if (!tj3Var3.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                            tj3Var3.m22102U();
                                                        } else {
                                                            y27 y27VarM18236U = AbstractC3423or.m18236U(t61Var3.f61908k ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var3, 0);
                                                            ((fe9) tj3Var3.m22128k(ge9.f40637a)).getClass();
                                                            ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var3, 56, 8);
                                                        }
                                                        break;
                                                    default:
                                                        ye1 ye1Var4 = (ye1) obj8;
                                                        int iIntValue4 = ((Integer) obj9).intValue();
                                                        tj3 tj3Var4 = (tj3) ye1Var4;
                                                        if (!tj3Var4.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                                            tj3Var4.m22102U();
                                                        } else {
                                                            y27 y27VarM18236U2 = AbstractC3423or.m18236U(t61Var3.f61903f ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var4, 0);
                                                            ((fe9) tj3Var4.m22128k(ge9.f40637a)).getClass();
                                                            ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var4, 56, 8);
                                                        }
                                                        break;
                                                }
                                                return xfaVar3;
                                            }
                                        }, tj3Var2), null, tj3Var2, 24582, 492);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }), 3);
                }
                if (t61Var.f61905h) {
                    vu4.m23545g(vu4Var2, null, new C0282a(-888157075, true, new qe0(vi3Var2, i5)), 3);
                }
                vu4.m23545g(vu4Var2, null, new C0282a(-1141371899, true, new qe0(vi3Var, 5)), 3);
                if (!t61Var.f61906i) {
                    vu4.m23545g(vu4Var2, null, new C0282a(-1547223156, true, new qe0(vi3Var2, i10)), 3);
                }
                return xfaVar;
            case 9:
                vu4 vu4Var3 = (vu4) obj;
                vu4Var3.getClass();
                List list2 = ((p71) obj4).f55685a;
                int i13 = 5;
                vu4Var3.m23547h(list2.size(), new ue0(i5, new jx0(i13), list2), new C3520r2(i13, list2), new C0282a(2039820996, true, new o71(list2, (vi3) obj3, (vi3) obj2, i8)));
                vu4.m23545g(vu4Var3, null, lob.f49952a, 3);
                return xfaVar;
            case 10:
                final lv1 lv1Var = (lv1) obj4;
                final vi3 vi3Var3 = (vi3) obj3;
                vi3 vi3Var4 = (vi3) obj2;
                tv4 tv4Var = (tv4) obj;
                tv4Var.getClass();
                int i14 = 11;
                tv4.m22312g(tv4Var, null, new C0282a(-1973599401, true, new se0(lv1Var, i14)), 3);
                CupPhase cupPhase = lv1Var.f50170a;
                boolean z2 = lv1Var.f50171b;
                ru1 ru1Var = lv1Var.f50177h;
                List list3 = lv1Var.f50175f;
                if (cupPhase == CupPhase.Finished) {
                    if (ru1Var != null) {
                        z = ru1Var.f59823l;
                    } else if (lv1Var.f50172c.f72128e == null) {
                        z = true;
                    }
                    if (z) {
                        tv4.m22312g(tv4Var, null, hpb.f42754c, 3);
                    }
                    if (!z2) {
                        tv4.m22312g(tv4Var, null, new C0282a(-1637132083, true, new qe0(vi3Var3, 10)), 7);
                        if (!list3.isEmpty()) {
                            tv4.m22312g(tv4Var, null, new C0282a(1382093096, true, new aj3() { // from class: gv1
                                @Override // p000.aj3
                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                    int i15 = i7;
                                    xfa xfaVar2 = xfa.f68157a;
                                    p84 p84Var = we1.f66679a;
                                    vi3 vi3Var5 = vi3Var3;
                                    lv1 lv1Var2 = lv1Var;
                                    switch (i15) {
                                        case 0:
                                            ye1 ye1Var = (ye1) obj6;
                                            int iIntValue = ((Integer) obj7).intValue();
                                            ((vv4) obj5).getClass();
                                            tj3 tj3Var = (tj3) ye1Var;
                                            if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                tj3Var.m22102U();
                                            } else {
                                                List list4 = lv1Var2.f50174e;
                                                boolean zM22120g = tj3Var.m22120g(vi3Var5);
                                                Object objM22097O = tj3Var.m22097O();
                                                if (zM22120g || objM22097O == p84Var) {
                                                    objM22097O = new hv1(vi3Var5, 6);
                                                    tj3Var.m22131l0(objM22097O);
                                                }
                                                rv1.m20864i(0, tj3Var, (ui3) objM22097O, null, list4);
                                            }
                                            break;
                                        case 1:
                                            ye1 ye1Var2 = (ye1) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((vv4) obj5).getClass();
                                            tj3 tj3Var2 = (tj3) ye1Var2;
                                            if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                tj3Var2.m22102U();
                                            } else {
                                                List list5 = lv1Var2.f50175f;
                                                boolean zM22120g2 = tj3Var2.m22120g(vi3Var5);
                                                Object objM22097O2 = tj3Var2.m22097O();
                                                if (zM22120g2 || objM22097O2 == p84Var) {
                                                    objM22097O2 = new f91(vi3Var5, 28);
                                                    tj3Var2.m22131l0(objM22097O2);
                                                }
                                                ui3 ui3Var2 = (ui3) objM22097O2;
                                                boolean zM22120g3 = tj3Var2.m22120g(vi3Var5);
                                                Object objM22097O3 = tj3Var2.m22097O();
                                                if (zM22120g3 || objM22097O3 == p84Var) {
                                                    objM22097O3 = new te0(vi3Var5, 9);
                                                    tj3Var2.m22131l0(objM22097O3);
                                                }
                                                w9d.m23820a(list5, ui3Var2, (vi3) objM22097O3, null, tj3Var2, 0);
                                            }
                                            break;
                                        case 2:
                                            ye1 ye1Var3 = (ye1) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            ((vv4) obj5).getClass();
                                            tj3 tj3Var3 = (tj3) ye1Var3;
                                            if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                tj3Var3.m22102U();
                                            } else {
                                                List list6 = lv1Var2.f50175f;
                                                boolean zM22120g4 = tj3Var3.m22120g(vi3Var5);
                                                Object objM22097O4 = tj3Var3.m22097O();
                                                if (zM22120g4 || objM22097O4 == p84Var) {
                                                    objM22097O4 = new hv1(vi3Var5, 12);
                                                    tj3Var3.m22131l0(objM22097O4);
                                                }
                                                ui3 ui3Var3 = (ui3) objM22097O4;
                                                boolean zM22120g5 = tj3Var3.m22120g(vi3Var5);
                                                Object objM22097O5 = tj3Var3.m22097O();
                                                if (zM22120g5 || objM22097O5 == p84Var) {
                                                    objM22097O5 = new te0(vi3Var5, 11);
                                                    tj3Var3.m22131l0(objM22097O5);
                                                }
                                                w9d.m23820a(list6, ui3Var3, (vi3) objM22097O5, null, tj3Var3, 0);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var4 = (ye1) obj6;
                                            int iIntValue4 = ((Integer) obj7).intValue();
                                            ((vv4) obj5).getClass();
                                            tj3 tj3Var4 = (tj3) ye1Var4;
                                            if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                tj3Var4.m22102U();
                                            } else {
                                                List list7 = lv1Var2.f50175f;
                                                boolean zM22120g6 = tj3Var4.m22120g(vi3Var5);
                                                Object objM22097O6 = tj3Var4.m22097O();
                                                if (zM22120g6 || objM22097O6 == p84Var) {
                                                    objM22097O6 = new f91(vi3Var5, 29);
                                                    tj3Var4.m22131l0(objM22097O6);
                                                }
                                                ui3 ui3Var4 = (ui3) objM22097O6;
                                                boolean zM22120g7 = tj3Var4.m22120g(vi3Var5);
                                                Object objM22097O7 = tj3Var4.m22097O();
                                                if (zM22120g7 || objM22097O7 == p84Var) {
                                                    objM22097O7 = new te0(vi3Var5, 10);
                                                    tj3Var4.m22131l0(objM22097O7);
                                                }
                                                w9d.m23820a(list7, ui3Var4, (vi3) objM22097O7, null, tj3Var4, 0);
                                            }
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            }), 7);
                        }
                    } else if (ru1Var != null) {
                        if (ru1Var.f59823l) {
                            str2 = null;
                            tv4.m22312g(tv4Var, null, new C0282a(-1682389037, true, new qe0(vi3Var3, 9)), 7);
                        } else {
                            str2 = null;
                        }
                        tv4.m22312g(tv4Var, str2, new C0282a(-831297672, true, new ik0(ru1Var, lv1Var, vi3Var3, i4)), 3);
                    }
                } else {
                    CupPhase cupPhase2 = CupPhase.LiveNotJoined;
                    if (cupPhase == cupPhase2 || cupPhase == CupPhase.LiveSpectator) {
                        if (cupPhase == cupPhase2) {
                            tv4.m22312g(tv4Var, null, new C0282a(-1055467132, true, new qe0(vi3Var4, i14)), 3);
                        }
                        tv4.m22312g(tv4Var, null, new C0282a(1166120489, true, new qe0(vi3Var3, 12)), 7);
                        if (!list3.isEmpty()) {
                            tv4.m22312g(tv4Var, null, new C0282a(171326971, true, new aj3() { // from class: gv1
                                @Override // p000.aj3
                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                    int i15 = i6;
                                    xfa xfaVar2 = xfa.f68157a;
                                    p84 p84Var = we1.f66679a;
                                    vi3 vi3Var5 = vi3Var3;
                                    lv1 lv1Var2 = lv1Var;
                                    switch (i15) {
                                        case 0:
                                            ye1 ye1Var = (ye1) obj6;
                                            int iIntValue = ((Integer) obj7).intValue();
                                            ((vv4) obj5).getClass();
                                            tj3 tj3Var = (tj3) ye1Var;
                                            if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                tj3Var.m22102U();
                                            } else {
                                                List list4 = lv1Var2.f50174e;
                                                boolean zM22120g = tj3Var.m22120g(vi3Var5);
                                                Object objM22097O = tj3Var.m22097O();
                                                if (zM22120g || objM22097O == p84Var) {
                                                    objM22097O = new hv1(vi3Var5, 6);
                                                    tj3Var.m22131l0(objM22097O);
                                                }
                                                rv1.m20864i(0, tj3Var, (ui3) objM22097O, null, list4);
                                            }
                                            break;
                                        case 1:
                                            ye1 ye1Var2 = (ye1) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((vv4) obj5).getClass();
                                            tj3 tj3Var2 = (tj3) ye1Var2;
                                            if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                tj3Var2.m22102U();
                                            } else {
                                                List list5 = lv1Var2.f50175f;
                                                boolean zM22120g2 = tj3Var2.m22120g(vi3Var5);
                                                Object objM22097O2 = tj3Var2.m22097O();
                                                if (zM22120g2 || objM22097O2 == p84Var) {
                                                    objM22097O2 = new f91(vi3Var5, 28);
                                                    tj3Var2.m22131l0(objM22097O2);
                                                }
                                                ui3 ui3Var2 = (ui3) objM22097O2;
                                                boolean zM22120g3 = tj3Var2.m22120g(vi3Var5);
                                                Object objM22097O3 = tj3Var2.m22097O();
                                                if (zM22120g3 || objM22097O3 == p84Var) {
                                                    objM22097O3 = new te0(vi3Var5, 9);
                                                    tj3Var2.m22131l0(objM22097O3);
                                                }
                                                w9d.m23820a(list5, ui3Var2, (vi3) objM22097O3, null, tj3Var2, 0);
                                            }
                                            break;
                                        case 2:
                                            ye1 ye1Var3 = (ye1) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            ((vv4) obj5).getClass();
                                            tj3 tj3Var3 = (tj3) ye1Var3;
                                            if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                tj3Var3.m22102U();
                                            } else {
                                                List list6 = lv1Var2.f50175f;
                                                boolean zM22120g4 = tj3Var3.m22120g(vi3Var5);
                                                Object objM22097O4 = tj3Var3.m22097O();
                                                if (zM22120g4 || objM22097O4 == p84Var) {
                                                    objM22097O4 = new hv1(vi3Var5, 12);
                                                    tj3Var3.m22131l0(objM22097O4);
                                                }
                                                ui3 ui3Var3 = (ui3) objM22097O4;
                                                boolean zM22120g5 = tj3Var3.m22120g(vi3Var5);
                                                Object objM22097O5 = tj3Var3.m22097O();
                                                if (zM22120g5 || objM22097O5 == p84Var) {
                                                    objM22097O5 = new te0(vi3Var5, 11);
                                                    tj3Var3.m22131l0(objM22097O5);
                                                }
                                                w9d.m23820a(list6, ui3Var3, (vi3) objM22097O5, null, tj3Var3, 0);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var4 = (ye1) obj6;
                                            int iIntValue4 = ((Integer) obj7).intValue();
                                            ((vv4) obj5).getClass();
                                            tj3 tj3Var4 = (tj3) ye1Var4;
                                            if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                tj3Var4.m22102U();
                                            } else {
                                                List list7 = lv1Var2.f50175f;
                                                boolean zM22120g6 = tj3Var4.m22120g(vi3Var5);
                                                Object objM22097O6 = tj3Var4.m22097O();
                                                if (zM22120g6 || objM22097O6 == p84Var) {
                                                    objM22097O6 = new f91(vi3Var5, 29);
                                                    tj3Var4.m22131l0(objM22097O6);
                                                }
                                                ui3 ui3Var4 = (ui3) objM22097O6;
                                                boolean zM22120g7 = tj3Var4.m22120g(vi3Var5);
                                                Object objM22097O7 = tj3Var4.m22097O();
                                                if (zM22120g7 || objM22097O7 == p84Var) {
                                                    objM22097O7 = new te0(vi3Var5, 10);
                                                    tj3Var4.m22131l0(objM22097O7);
                                                }
                                                w9d.m23820a(list7, ui3Var4, (vi3) objM22097O7, null, tj3Var4, 0);
                                            }
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            }), 7);
                        }
                    } else if (z2) {
                        CupPhase cupPhase3 = CupPhase.PreCup;
                        rs1 rs1Var = lv1Var.f50176g;
                        if (cupPhase == cupPhase3) {
                            if (rs1Var != null) {
                                i = 7;
                                str = null;
                                tv4.m22312g(tv4Var, null, new C0282a(-1605075597, true, new qe0(vi3Var3, 14)), 7);
                            } else {
                                i = 7;
                                str = null;
                            }
                            tv4.m22312g(tv4Var, str, hpb.f42757f, i);
                        } else {
                            if (rs1Var != null) {
                                tv4.m22312g(tv4Var, null, new C0282a(496263455, true, new qe0(vi3Var3, 8)), 7);
                            }
                            fz1 fz1Var = lv1Var.f50173d;
                            if (fz1Var != null) {
                                tv4.m22312g(tv4Var, null, new C0282a(-990040559, true, new ik0(fz1Var, vi3Var4, vi3Var3, 15)), 7);
                            }
                            if (!lv1Var.f50174e.isEmpty()) {
                                tv4.m22312g(tv4Var, null, new C0282a(1401218668, true, new aj3() { // from class: gv1
                                    @Override // p000.aj3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        int i15 = i8;
                                        xfa xfaVar2 = xfa.f68157a;
                                        p84 p84Var = we1.f66679a;
                                        vi3 vi3Var5 = vi3Var3;
                                        lv1 lv1Var2 = lv1Var;
                                        switch (i15) {
                                            case 0:
                                                ye1 ye1Var = (ye1) obj6;
                                                int iIntValue = ((Integer) obj7).intValue();
                                                ((vv4) obj5).getClass();
                                                tj3 tj3Var = (tj3) ye1Var;
                                                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    tj3Var.m22102U();
                                                } else {
                                                    List list4 = lv1Var2.f50174e;
                                                    boolean zM22120g = tj3Var.m22120g(vi3Var5);
                                                    Object objM22097O = tj3Var.m22097O();
                                                    if (zM22120g || objM22097O == p84Var) {
                                                        objM22097O = new hv1(vi3Var5, 6);
                                                        tj3Var.m22131l0(objM22097O);
                                                    }
                                                    rv1.m20864i(0, tj3Var, (ui3) objM22097O, null, list4);
                                                }
                                                break;
                                            case 1:
                                                ye1 ye1Var2 = (ye1) obj6;
                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                ((vv4) obj5).getClass();
                                                tj3 tj3Var2 = (tj3) ye1Var2;
                                                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    tj3Var2.m22102U();
                                                } else {
                                                    List list5 = lv1Var2.f50175f;
                                                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var5);
                                                    Object objM22097O2 = tj3Var2.m22097O();
                                                    if (zM22120g2 || objM22097O2 == p84Var) {
                                                        objM22097O2 = new f91(vi3Var5, 28);
                                                        tj3Var2.m22131l0(objM22097O2);
                                                    }
                                                    ui3 ui3Var2 = (ui3) objM22097O2;
                                                    boolean zM22120g3 = tj3Var2.m22120g(vi3Var5);
                                                    Object objM22097O3 = tj3Var2.m22097O();
                                                    if (zM22120g3 || objM22097O3 == p84Var) {
                                                        objM22097O3 = new te0(vi3Var5, 9);
                                                        tj3Var2.m22131l0(objM22097O3);
                                                    }
                                                    w9d.m23820a(list5, ui3Var2, (vi3) objM22097O3, null, tj3Var2, 0);
                                                }
                                                break;
                                            case 2:
                                                ye1 ye1Var3 = (ye1) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                ((vv4) obj5).getClass();
                                                tj3 tj3Var3 = (tj3) ye1Var3;
                                                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    tj3Var3.m22102U();
                                                } else {
                                                    List list6 = lv1Var2.f50175f;
                                                    boolean zM22120g4 = tj3Var3.m22120g(vi3Var5);
                                                    Object objM22097O4 = tj3Var3.m22097O();
                                                    if (zM22120g4 || objM22097O4 == p84Var) {
                                                        objM22097O4 = new hv1(vi3Var5, 12);
                                                        tj3Var3.m22131l0(objM22097O4);
                                                    }
                                                    ui3 ui3Var3 = (ui3) objM22097O4;
                                                    boolean zM22120g5 = tj3Var3.m22120g(vi3Var5);
                                                    Object objM22097O5 = tj3Var3.m22097O();
                                                    if (zM22120g5 || objM22097O5 == p84Var) {
                                                        objM22097O5 = new te0(vi3Var5, 11);
                                                        tj3Var3.m22131l0(objM22097O5);
                                                    }
                                                    w9d.m23820a(list6, ui3Var3, (vi3) objM22097O5, null, tj3Var3, 0);
                                                }
                                                break;
                                            default:
                                                ye1 ye1Var4 = (ye1) obj6;
                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                ((vv4) obj5).getClass();
                                                tj3 tj3Var4 = (tj3) ye1Var4;
                                                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                    tj3Var4.m22102U();
                                                } else {
                                                    List list7 = lv1Var2.f50175f;
                                                    boolean zM22120g6 = tj3Var4.m22120g(vi3Var5);
                                                    Object objM22097O6 = tj3Var4.m22097O();
                                                    if (zM22120g6 || objM22097O6 == p84Var) {
                                                        objM22097O6 = new f91(vi3Var5, 29);
                                                        tj3Var4.m22131l0(objM22097O6);
                                                    }
                                                    ui3 ui3Var4 = (ui3) objM22097O6;
                                                    boolean zM22120g7 = tj3Var4.m22120g(vi3Var5);
                                                    Object objM22097O7 = tj3Var4.m22097O();
                                                    if (zM22120g7 || objM22097O7 == p84Var) {
                                                        objM22097O7 = new te0(vi3Var5, 10);
                                                        tj3Var4.m22131l0(objM22097O7);
                                                    }
                                                    w9d.m23820a(list7, ui3Var4, (vi3) objM22097O7, null, tj3Var4, 0);
                                                }
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                }), 7);
                            }
                            if (lv1Var.f50170a == CupPhase.LiveJoined && !list3.isEmpty()) {
                                tv4.m22312g(tv4Var, null, new C0282a(-1383726803, true, new aj3() { // from class: gv1
                                    @Override // p000.aj3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        int i15 = i10;
                                        xfa xfaVar2 = xfa.f68157a;
                                        p84 p84Var = we1.f66679a;
                                        vi3 vi3Var5 = vi3Var3;
                                        lv1 lv1Var2 = lv1Var;
                                        switch (i15) {
                                            case 0:
                                                ye1 ye1Var = (ye1) obj6;
                                                int iIntValue = ((Integer) obj7).intValue();
                                                ((vv4) obj5).getClass();
                                                tj3 tj3Var = (tj3) ye1Var;
                                                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    tj3Var.m22102U();
                                                } else {
                                                    List list4 = lv1Var2.f50174e;
                                                    boolean zM22120g = tj3Var.m22120g(vi3Var5);
                                                    Object objM22097O = tj3Var.m22097O();
                                                    if (zM22120g || objM22097O == p84Var) {
                                                        objM22097O = new hv1(vi3Var5, 6);
                                                        tj3Var.m22131l0(objM22097O);
                                                    }
                                                    rv1.m20864i(0, tj3Var, (ui3) objM22097O, null, list4);
                                                }
                                                break;
                                            case 1:
                                                ye1 ye1Var2 = (ye1) obj6;
                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                ((vv4) obj5).getClass();
                                                tj3 tj3Var2 = (tj3) ye1Var2;
                                                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    tj3Var2.m22102U();
                                                } else {
                                                    List list5 = lv1Var2.f50175f;
                                                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var5);
                                                    Object objM22097O2 = tj3Var2.m22097O();
                                                    if (zM22120g2 || objM22097O2 == p84Var) {
                                                        objM22097O2 = new f91(vi3Var5, 28);
                                                        tj3Var2.m22131l0(objM22097O2);
                                                    }
                                                    ui3 ui3Var2 = (ui3) objM22097O2;
                                                    boolean zM22120g3 = tj3Var2.m22120g(vi3Var5);
                                                    Object objM22097O3 = tj3Var2.m22097O();
                                                    if (zM22120g3 || objM22097O3 == p84Var) {
                                                        objM22097O3 = new te0(vi3Var5, 9);
                                                        tj3Var2.m22131l0(objM22097O3);
                                                    }
                                                    w9d.m23820a(list5, ui3Var2, (vi3) objM22097O3, null, tj3Var2, 0);
                                                }
                                                break;
                                            case 2:
                                                ye1 ye1Var3 = (ye1) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                ((vv4) obj5).getClass();
                                                tj3 tj3Var3 = (tj3) ye1Var3;
                                                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    tj3Var3.m22102U();
                                                } else {
                                                    List list6 = lv1Var2.f50175f;
                                                    boolean zM22120g4 = tj3Var3.m22120g(vi3Var5);
                                                    Object objM22097O4 = tj3Var3.m22097O();
                                                    if (zM22120g4 || objM22097O4 == p84Var) {
                                                        objM22097O4 = new hv1(vi3Var5, 12);
                                                        tj3Var3.m22131l0(objM22097O4);
                                                    }
                                                    ui3 ui3Var3 = (ui3) objM22097O4;
                                                    boolean zM22120g5 = tj3Var3.m22120g(vi3Var5);
                                                    Object objM22097O5 = tj3Var3.m22097O();
                                                    if (zM22120g5 || objM22097O5 == p84Var) {
                                                        objM22097O5 = new te0(vi3Var5, 11);
                                                        tj3Var3.m22131l0(objM22097O5);
                                                    }
                                                    w9d.m23820a(list6, ui3Var3, (vi3) objM22097O5, null, tj3Var3, 0);
                                                }
                                                break;
                                            default:
                                                ye1 ye1Var4 = (ye1) obj6;
                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                ((vv4) obj5).getClass();
                                                tj3 tj3Var4 = (tj3) ye1Var4;
                                                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                    tj3Var4.m22102U();
                                                } else {
                                                    List list7 = lv1Var2.f50175f;
                                                    boolean zM22120g6 = tj3Var4.m22120g(vi3Var5);
                                                    Object objM22097O6 = tj3Var4.m22097O();
                                                    if (zM22120g6 || objM22097O6 == p84Var) {
                                                        objM22097O6 = new f91(vi3Var5, 29);
                                                        tj3Var4.m22131l0(objM22097O6);
                                                    }
                                                    ui3 ui3Var4 = (ui3) objM22097O6;
                                                    boolean zM22120g7 = tj3Var4.m22120g(vi3Var5);
                                                    Object objM22097O7 = tj3Var4.m22097O();
                                                    if (zM22120g7 || objM22097O7 == p84Var) {
                                                        objM22097O7 = new te0(vi3Var5, 10);
                                                        tj3Var4.m22131l0(objM22097O7);
                                                    }
                                                    w9d.m23820a(list7, ui3Var4, (vi3) objM22097O7, null, tj3Var4, 0);
                                                }
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                }), 7);
                            }
                        }
                    } else {
                        tv4.m22312g(tv4Var, null, new C0282a(-1618824982, true, new qe0(vi3Var4, 13)), 3);
                    }
                }
                return xfaVar;
            case 11:
                tw1 tw1Var = (tw1) obj4;
                vi3 vi3Var5 = (vi3) obj2;
                vu4 vu4Var4 = (vu4) obj;
                vu4Var4.getClass();
                vu4.m23545g(vu4Var4, null, new C0282a(445951907, true, new lw1(tw1Var, i8)), 3);
                vu4.m23545g(vu4Var4, null, new C0282a(1085685516, true, new mw1(tw1Var, (vi3) obj3, i8)), 3);
                int i15 = sw1.f61507a[tw1Var.f62978b.ordinal()];
                if (i15 == 1) {
                    String str4 = tw1Var.f62979c;
                    if (str4 != null) {
                        str3 = null;
                        vu4.m23545g(vu4Var4, null, new C0282a(899241968, true, new ik0(str4, tw1Var, vi3Var5, 19)), 3);
                    } else {
                        str3 = null;
                    }
                    vu4.m23545g(vu4Var4, str3, new C0282a(1603140779, true, new mw1(tw1Var, vi3Var5, i10)), 3);
                    vu4.m23545g(vu4Var4, str3, jpb.f45983c, 3);
                    vu4.m23545g(vu4Var4, str3, jpb.f45984d, 3);
                } else {
                    if (i15 != 2) {
                        gm5.m12750e();
                        return null;
                    }
                    if (tw1Var.f62983g) {
                        vu4.m23545g(vu4Var4, null, jpb.f45985e, 3);
                    } else {
                        if (tw1Var.f62986j) {
                            vu4.m23545g(vu4Var4, null, new C0282a(-1470360189, true, new lw1(tw1Var, i10)), 3);
                        }
                        vu4.m23545g(vu4Var4, null, new C0282a(920800382, true, new lw1(tw1Var, i7)), 3);
                    }
                }
                return xfaVar;
            case 12:
                Context context = (Context) obj3;
                nt9 nt9Var = (nt9) obj2;
                sl1 sl1Var = (sl1) obj;
                List list4 = ((ct9) obj4).f34529a;
                int size = list4.size();
                int i16 = 0;
                while (i16 < size) {
                    bt9 bt9Var = (bt9) list4.get(i16);
                    if (bt9Var instanceof jt9) {
                        jt9 jt9Var = (jt9) bt9Var;
                        C3368nd c3368nd = new C3368nd(jt9Var, 26);
                        if (jt9Var.f46134c != 0) {
                            c0282a = new C0282a(-1930700965, true, new it9(jt9Var, i7));
                        }
                        sl1.m21445b(sl1Var, c3368nd, c0282a, new C3577sk(13, jt9Var, nt9Var), 6);
                    } else if (bt9Var instanceof ot9) {
                        ot9 ot9Var = (ot9) bt9Var;
                        if (context != null) {
                            int i17 = ot9Var.f54977c;
                            TextClassification textClassification = ot9Var.f54976b;
                            Drawable drawable = ot9Var.f54978d;
                            if (i17 < 0) {
                                sl1.m21445b(sl1Var, new dl9(textClassification, i10), drawable != null ? new C0282a(-1123224187, true, new it9(drawable, i8)) : null, new qk9(i10, context, textClassification), 6);
                            } else {
                                RemoteAction remoteAction = textClassification.getActions().get(i17);
                                sl1.m21445b(sl1Var, new dl9(remoteAction, i7), drawable != null ? new C0282a(1106162332, true, new it9(drawable, i10)) : null, new br8(remoteAction, 5), 6);
                            }
                        }
                    } else if (bt9Var instanceof mt9) {
                        sl1Var.f60971a.add(do7.f35953b);
                    }
                    i16++;
                    c0282a = null;
                }
                return xfaVar;
            case 13:
                jt5 jt5Var = (jt5) obj4;
                dl2 dl2Var = (dl2) obj3;
                l87 l87Var = (l87) obj2;
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                boolean zMo211f0 = jt5Var.mo211f0();
                C0097e c0097e = dl2Var.f35777J;
                float fM133f = zMo211f0 ? c0097e.m849c().m133f(dl2Var.f35777J.f2240i.getValue()) : c0097e.f2241j.m19861h();
                boolean zMo211f1 = jt5Var.mo211f0();
                if (Float.isNaN(fM133f)) {
                    throw new AnchoredDraggableUninitializedException(zMo211f1, dl2Var.f35780M, dl2Var.f35777J.m849c(), dl2Var.f35777J.f2240i.getValue());
                }
                float f7 = (te1.m21979L(dl2Var).f4328U == LayoutDirection.Rtl && dl2Var.f35779L == Orientation.Horizontal) ? -1.0f : 1.0f;
                Orientation orientation = dl2Var.f35779L;
                float f8 = orientation == Orientation.Horizontal ? f7 * fM133f : 0.0f;
                if (orientation != Orientation.Vertical) {
                    fM133f = 0.0f;
                }
                abstractC0343j.f4216a = true;
                abstractC0343j.m1530f(l87Var, ss5.m21693T(f8), ss5.m21693T(fM133f), 0.0f);
                abstractC0343j.f4216a = false;
                return xfaVar;
            case 14:
                vu4 vu4Var5 = (vu4) obj;
                vu4Var5.getClass();
                List list5 = ((f03) obj4).f38134a;
                vu4Var5.m23547h(list5.size(), new ue0(8, new ae1(20), list5), new C3520r2(13, list5), new C0282a(802480018, true, new o71(list5, (vi3) obj3, (vi3) obj2, i10)));
                vu4.m23545g(vu4Var5, null, tpb.f62716a, 3);
                return xfaVar;
            case 15:
                String str5 = (String) obj4;
                vi3 vi3Var6 = (vi3) obj2;
                float fFloatValue3 = ((Float) obj).floatValue();
                ((vi3) obj3).invoke(new gb7(fFloatValue3));
                if (str5 != null) {
                    vi3Var6.invoke(new mbb((int) TimeUnit.SECONDS.toMillis((long) fFloatValue3)));
                }
                return xfaVar;
            case 16:
                t66 t66Var = (t66) obj2;
                kg7 kg7Var = (kg7) obj;
                int iM4630e = cfd.m4630e((StaticLayout) obj4, kg7Var.f47237c);
                Iterator it2 = ((List) obj3).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        xz7 xz7Var = ((q7b) it2.next()).f57357a;
                        if (xz7Var.f69004a > iM4630e || xz7Var.f69005b <= iM4630e) {
                            i9++;
                        }
                    } else {
                        i9 = -1;
                    }
                }
                Integer numValueOf = i9 != -1 ? Integer.valueOf(i9) : null;
                if (numValueOf != null) {
                    Regex regex = AbstractC1932c.f24144a;
                    t66Var.setValue(numValueOf);
                }
                kg7Var.m15189a();
                return xfaVar;
            case 17:
                C3419on c3419on = (C3419on) obj3;
                vi3 vi3Var7 = (vi3) obj2;
                gq6 gq6Var = (gq6) obj;
                rw9 rw9Var = (rw9) ((t66) obj4).getValue();
                if (rw9Var != null) {
                    int iM23746g = rw9Var.f59976b.m23746g(gq6Var.f41189a);
                    C3378nn c3378nn = (C3378nn) u91.m22591I0(c3419on.m18172b(iM23746g, "URL", iM23746g));
                    if (c3378nn != null) {
                        vi3Var7.invoke(c3378nn.f52979a);
                    }
                }
                return xfaVar;
            case 18:
                vi3 vi3Var8 = (vi3) obj4;
                vi3 vi3Var9 = (vi3) obj3;
                qc9 qc9Var = (qc9) obj2;
                PlayerConstants$PlayerState playerConstants$PlayerState = (PlayerConstants$PlayerState) obj;
                playerConstants$PlayerState.getClass();
                int i18 = t54.f61876a[playerConstants$PlayerState.ordinal()];
                if (i18 == 1) {
                    vi3Var8.invoke(Boolean.TRUE);
                } else if (i18 == 2) {
                    vi3Var8.invoke(Boolean.FALSE);
                } else if (i18 == 3) {
                    if (qc9Var.m19861h() > 0.0f) {
                        vi3Var9.invoke(Float.valueOf(qc9Var.m19861h()));
                    }
                    vi3Var8.invoke(Boolean.FALSE);
                }
                return xfaVar;
            case 19:
                zi3 zi3Var = (zi3) obj3;
                zh9 zh9Var = (zh9) obj2;
                ((LanguageProgressMetric) obj).getClass();
                LanguageProgressMetric languageProgressMetric = ((bh9) obj4).f8547a;
                if (languageProgressMetric != null) {
                    zi3Var.invoke(((yh9) zh9Var).f69852a, languageProgressMetric);
                }
                return xfaVar;
            case 20:
                Double d = (Double) obj;
                d.getClass();
                ((zi3) obj4).invoke(((jo4) obj3).f45910a.f10320a, d);
                ((t66) obj2).setValue(Boolean.FALSE);
                return xfaVar;
            case 21:
                Double d2 = (Double) obj;
                d2.getClass();
                ((zi3) obj4).invoke((LanguageProgressMetric) obj3, d2);
                ((t66) obj2).setValue(Boolean.FALSE);
                return xfaVar;
            case 22:
                final rn4 rn4Var = (rn4) obj4;
                qn4 qn4Var = (qn4) obj3;
                tv4 tv4Var2 = (tv4) obj;
                tv4Var2.getClass();
                tv4.m22312g(tv4Var2, null, new C0282a(-1229495648, true, new C3180kd(25, (n4b) obj2, rn4Var)), 7);
                tv4.m22312g(tv4Var2, null, new C0282a(952656073, true, new aj3() { // from class: ap4
                    @Override // p000.aj3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i19 = i8;
                        xfa xfaVar2 = xfa.f68157a;
                        b16 b16Var = b16.f7762a;
                        rn4 rn4Var2 = rn4Var;
                        ye1 ye1Var = (ye1) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        ((vv4) obj5).getClass();
                        int i20 = iIntValue & 17;
                        switch (i19) {
                            case 0:
                                tj3 tj3Var = (tj3) ye1Var;
                                if (!tj3Var.m22099R(iIntValue & 1, i20 != 16)) {
                                    tj3Var.m22102U();
                                } else {
                                    cid.m4751b(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 0.0f, 0.0f, 13), rn4Var2.f59580b, tj3Var, 0);
                                }
                                break;
                            default:
                                tj3 tj3Var2 = (tj3) ye1Var;
                                if (!tj3Var2.m22099R(iIntValue & 1, i20 != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                                    l77 l77VarM22132m = tj3Var2.m22132m();
                                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var);
                                    se1.f60731q.getClass();
                                    ui3 ui3Var2 = C0352b.f4299b;
                                    tj3Var2.m22119f0();
                                    if (tj3Var2.f62384S) {
                                        tj3Var2.m22130l(ui3Var2);
                                    } else {
                                        tj3Var2.m22137o0();
                                    }
                                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                                    oha.m18000f(tj3Var2, C0352b.f4305h);
                                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                                    cid.m4759j(vz1.m23620a0(tj3Var2, com.lingq.feature.statistics.R$string.stats_level), tj3Var2, 0);
                                    cid.m4760k(rn4Var2.f59584f, tj3Var2, 0);
                                    ux5.m23003z(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38963l, tj3Var2, true);
                                }
                                break;
                        }
                        return xfaVar2;
                    }
                }), 7);
                d4b d4bVar = rn4Var.f59581c;
                if ((d4bVar instanceof c4b) || (d4bVar instanceof b4b)) {
                    zi3 zi3Var2 = qn4Var.f57977c;
                    ui3 ui3Var2 = qn4Var.f57975a;
                    d4bVar.getClass();
                    zi3Var2.getClass();
                    ui3Var2.getClass();
                    if (d4bVar instanceof c4b) {
                        tv4.m22312g(tv4Var2, null, new C0282a(-206258350, true, new ik0(ui3Var2, (Object) d4bVar, (xi3) zi3Var2, 29)), 7);
                    } else {
                        tv4.m22312g(tv4Var2, null, new C0282a(-1942802711, true, new ze2(i6, ui3Var2)), 7);
                    }
                }
                uj9 uj9Var = rn4Var.f59582d;
                if ((uj9Var instanceof tj9) || (uj9Var instanceof sj9)) {
                    i2 = 7;
                    tv4.m22312g(tv4Var2, null, new C0282a(670582798, true, new bp4(rn4Var, qn4Var)), 7);
                } else {
                    i2 = 7;
                }
                tv4.m22312g(tv4Var2, null, nsb.f53219e, i2);
                InterfaceC3066h8 interfaceC3066h8 = rn4Var.f59583e;
                if ((interfaceC3066h8 instanceof C2992f8) || (interfaceC3066h8 instanceof C3029g8)) {
                    tv4.m22312g(tv4Var2, null, new C0282a(2016337005, true, new bp4(qn4Var, rn4Var, i10)), 7);
                }
                a85 a85Var = rn4Var.f59584f;
                if ((a85Var instanceof y75) || (a85Var instanceof z75)) {
                    tv4.m22312g(tv4Var2, null, new C0282a(-932876084, true, new aj3() { // from class: ap4
                        @Override // p000.aj3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i19 = i10;
                            xfa xfaVar2 = xfa.f68157a;
                            b16 b16Var = b16.f7762a;
                            rn4 rn4Var2 = rn4Var;
                            ye1 ye1Var = (ye1) obj6;
                            int iIntValue = ((Integer) obj7).intValue();
                            ((vv4) obj5).getClass();
                            int i20 = iIntValue & 17;
                            switch (i19) {
                                case 0:
                                    tj3 tj3Var = (tj3) ye1Var;
                                    if (!tj3Var.m22099R(iIntValue & 1, i20 != 16)) {
                                        tj3Var.m22102U();
                                    } else {
                                        cid.m4751b(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 0.0f, 0.0f, 13), rn4Var2.f59580b, tj3Var, 0);
                                    }
                                    break;
                                default:
                                    tj3 tj3Var2 = (tj3) ye1Var;
                                    if (!tj3Var2.m22099R(iIntValue & 1, i20 != 16)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                                        l77 l77VarM22132m = tj3Var2.m22132m();
                                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var);
                                        se1.f60731q.getClass();
                                        ui3 ui3Var3 = C0352b.f4299b;
                                        tj3Var2.m22119f0();
                                        if (tj3Var2.f62384S) {
                                            tj3Var2.m22130l(ui3Var3);
                                        } else {
                                            tj3Var2.m22137o0();
                                        }
                                        oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                                        oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                                        oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                                        oha.m18000f(tj3Var2, C0352b.f4305h);
                                        oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                                        cid.m4759j(vz1.m23620a0(tj3Var2, com.lingq.feature.statistics.R$string.stats_level), tj3Var2, 0);
                                        cid.m4760k(rn4Var2.f59584f, tj3Var2, 0);
                                        ux5.m23003z(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38963l, tj3Var2, true);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }), 7);
                }
                dt0 dt0Var = rn4Var.f59585g;
                boolean z3 = (dt0Var instanceof bt0) || (dt0Var instanceof ct0);
                if (rn4Var.f59587i != null || z3) {
                    tv4.m22312g(tv4Var2, null, new C0282a(412878123, true, new xh3(qn4Var, rn4Var, z3, i7)), 7);
                }
                g80 g80Var = rn4Var.f59586h;
                if ((g80Var instanceof e80) || (g80Var instanceof f80)) {
                    tv4.m22312g(tv4Var2, null, new C0282a(1758632330, true, new bp4(qn4Var, rn4Var, i7)), 7);
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                TokenStatus tokenStatus = (TokenStatus) obj;
                tokenStatus.getClass();
                ((t66) obj2).setValue(Boolean.FALSE);
                ((vi3) obj3).invoke(new u1b((String) obj4, y7d.m24986e(tokenStatus)));
                return xfaVar;
            case 24:
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                C1321i c1321i = (C1321i) obj2;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT `pinned`, `pinnedHard`, `tabs`, `code`, `id`, `title`, `order`, `originalTitle` FROM (SELECT * FROM LibraryShelfEntity WHERE language = ? AND code = ?)");
                try {
                    ik8VarMo2873e1.mo2874C(1, str6);
                    ik8VarMo2873e1.mo2874C(2, str7);
                    return ik8VarMo2873e1.mo2876a0() ? new LibraryShelf(((int) ik8VarMo2873e1.getLong(0)) != 0, ((int) ik8VarMo2873e1.getLong(1)) != 0, c1321i.f17038O.m20057L(ik8VarMo2873e1.mo2875L(2)), ik8VarMo2873e1.mo2875L(3), (int) ik8VarMo2873e1.getLong(4), ik8VarMo2873e1.mo2875L(5), (int) ik8VarMo2873e1.getLong(6), ik8VarMo2873e1.mo2875L(7)) : null;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 25:
                ub5 ub5Var = (ub5) obj4;
                pb5 pb5Var = new pb5(i8, (Lifecycle$Event) obj3, (t66) obj2);
                ub5Var.mo256K().mo21323g(pb5Var);
                return new j91(i7, ub5Var, pb5Var);
            case 26:
                return m19656d(obj);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                Context context2 = (Context) obj2;
                String strConcat = (String) obj;
                strConcat.getClass();
                ((C2889e) obj4).mo7005P1((h24) obj3);
                if (cl9.m4842Y(strConcat, "/", false)) {
                    strConcat = "https://www.lingq.com".concat(strConcat);
                }
                mbd.m16753a(context2, strConcat);
                return xfaVar;
            case 28:
                return m19657g(obj);
            default:
                vi3 vi3Var10 = (vi3) obj3;
                vi3 vi3Var11 = (vi3) obj2;
                vu4 vu4Var6 = (vu4) obj;
                vu4Var6.getClass();
                qo6 qo6Var = ((fo6) obj4).f39386a;
                if (fa4.m11650l(qo6Var, no6.f53060a)) {
                    vu4.m23545g(vu4Var6, null, c2c.f9378c, 3);
                } else if (fa4.m11650l(qo6Var, oo6.f54654a)) {
                    vu4.m23545g(vu4Var6, null, c2c.f9379d, 3);
                } else {
                    if (!(qo6Var instanceof po6)) {
                        gm5.m12750e();
                        return null;
                    }
                    List list6 = ((po6) qo6Var).f56589a;
                    vu4Var6.m23547h(list6.size(), new ue0(i4, new lz5(18), list6), new C3520r2(22, list6), new C0282a(802480018, true, new o71(list6, vi3Var10, vi3Var11, i7)));
                }
                return xfaVar;
        }
    }

    public /* synthetic */ C3485q5(Object obj, Object obj2, Object obj3, int i) {
        this.f57275a = i;
        this.f57276b = obj;
        this.f57277c = obj2;
        this.f57278d = obj3;
    }
}
