package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.view.View;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.focus.C0301c;
import androidx.compose.p002ui.focus.InterfaceC0300b;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.work.impl.constraints.AbstractC0776b;
import com.lingq.core.data.repository.C1289e;
import com.lingq.core.data.repository.C1294j;
import com.lingq.core.database.dao.C1315c;
import com.lingq.core.domain.model.CoursePlaylistSort;
import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.domain.model.chat.LynxReasoningEffort;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.core.token.C1909e;
import com.lingq.feature.chat.domain.C1999d;
import com.lingq.feature.dictionary.C2069m;
import com.lingq.feature.reader.buylesson.C2256a;
import com.lingq.feature.reader.old.ReaderPageFragment;
import com.lingq.feature.reader.reader.AbstractC2500f;
import com.lingq.feature.reader.reader.C2493a;
import com.lingq.feature.reader.reader.state.C2503b;
import com.lingq.feature.reader.video.C2583a;
import com.lingq.feature.statistics.domain.C2814a;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.AbstractC3224d;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zg0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71511a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f71512b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f71513c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f71514d;

    public /* synthetic */ zg0(C0269z c0269z, l43 l43Var, l43 l43Var2, l43 l43Var3) {
        this.f71511a = 0;
        this.f71512b = c0269z;
        this.f71513c = l43Var;
        this.f71514d = l43Var2;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        ClipData.Item itemAt;
        int i = this.f71511a;
        n2a n2aVar = n2a.f52243a;
        CharSequence text = null;
        text = null;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f71514d;
        Object obj2 = this.f71513c;
        Object obj3 = this.f71512b;
        switch (i) {
            case 0:
                C0269z c0269z = (C0269z) obj3;
                c0269z.f3652f = (l43) obj2;
                c0269z.f3653g = (l43) obj;
                return xfaVar;
            case 1:
                ((t66) obj).setValue(Boolean.FALSE);
                ((vi3) obj3).invoke((String) obj2);
                return xfaVar;
            case 2:
                fr0 fr0Var = (fr0) obj3;
                vi3 vi3Var = (vi3) obj2;
                vi3 vi3Var2 = (vi3) obj;
                if (((qs0) fr0Var.f39504b).f58119a.f18862j || fr0Var.f39503a != ChallengeType.BookChallenge) {
                    vi3Var2.invoke(qq0.f58038a);
                } else {
                    vi3Var.invoke(new cr0(null));
                }
                return xfaVar;
            case 3:
                ld9 ld9Var = (ld9) obj2;
                jv0 jv0Var = (jv0) obj;
                InterfaceC0300b.m1355a((InterfaceC0300b) obj3);
                if (ld9Var != null) {
                    ((pa2) ld9Var).m19004a();
                }
                jv0Var.mo8886m();
                return xfaVar;
            case 4:
                ld9 ld9Var2 = (ld9) obj2;
                View view = (View) obj;
                ((C0301c) ((InterfaceC0300b) obj3)).m1358d(8, true, true);
                if (ld9Var2 != null) {
                    ((pa2) ld9Var2).m19004a();
                }
                k6b k6bVarM10635f = dta.m10635f(view);
                if (k6bVarM10635f != null) {
                    k6bVarM10635f.f46789a.mo3615d();
                }
                return xfaVar;
            case 5:
                ((t66) obj2).setValue((hw0) obj3);
                ((t66) obj).setValue(Boolean.TRUE);
                return xfaVar;
            case 6:
                ((t66) obj).setValue(Boolean.FALSE);
                ((vi3) obj3).invoke((CoursePlaylistSort) obj2);
                return xfaVar;
            case 7:
                C2069m c2069m = (C2069m) obj2;
                t66 t66Var = (t66) obj;
                Object systemService = ((Context) obj3).getSystemService("clipboard");
                systemService.getClass();
                ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
                if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null) {
                    text = itemAt.getText();
                }
                if (text != null) {
                    c2069m.m8982X2(((lf2) t66Var.getValue()).f49585d + " " + ((Object) text));
                }
                return xfaVar;
            case 8:
                ld9 ld9Var3 = (ld9) obj2;
                ((vi3) obj3).invoke(new dp2((String) ((t66) obj).getValue()));
                if (ld9Var3 != null) {
                    ((pa2) ld9Var3).m19004a();
                }
                return xfaVar;
            case 9:
                vi3 vi3Var3 = (vi3) obj2;
                vi3 vi3Var4 = (vi3) obj;
                if (((li3) obj3).f49709l) {
                    vi3Var3.invoke(kh3.f47293a);
                } else {
                    vi3Var3.invoke(jh3.f45542a);
                    vi3Var4.invoke(th3.f62274a);
                }
                return xfaVar;
            case 10:
                return ((C1294j) ((oo4) ((C2814a) obj3).f33431a)).m7236j((String) obj2, (LanguageProgressPeriod) obj);
            case 11:
                String str = (String) obj2;
                C1289e c1289e = (C1289e) ((C1999d) obj3).f25215b;
                c1289e.getClass();
                str.getClass();
                ((String) obj).getClass();
                C1315c c1315c = c1289e.f16467a;
                c1315c.getClass();
                return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1315c.f17001K, false, new String[]{"ChatHistoryEntity"}, new t70(str, 11)));
            case 12:
                return ((C1294j) ((oo4) ((C2814a) obj3).f33431a)).m7234h((String) obj2, (LanguageProgressInterval) obj);
            case 13:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj2;
                j44 j44Var = (j44) obj;
                if (((Ref$BooleanRef) obj3).f47713a) {
                    oj5.m18040f().m18042a(AbstractC0776b.f7235a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(j44Var);
                }
                return xfaVar;
            case 14:
                ((t66) obj).setValue(Boolean.FALSE);
                ((vi3) obj3).invoke((LanguageProgressMetric) obj2);
                return xfaVar;
            case 15:
                ((vi3) obj3).invoke(j45.f45041a);
                ((vi3) obj2).invoke(new p35(((f35) obj).f38342b.f41014d));
                return xfaVar;
            case 16:
                c35 c35Var = (c35) obj2;
                ((vi3) obj3).invoke(new m45(c35Var.f9390a, c35Var.f9401l, ((d35) obj).f34907f));
                return xfaVar;
            case 17:
                ((vi3) obj3).invoke((LynxReasoningEffort) obj2);
                ((ui3) obj).mo0a();
                return xfaVar;
            case 18:
                ((vi3) obj3).invoke((LynxChatModel) obj2);
                ((ui3) obj).mo0a();
                return xfaVar;
            case 19:
                ld9 ld9Var4 = (ld9) obj2;
                ui3 ui3Var = (ui3) obj;
                InterfaceC0300b.m1355a((InterfaceC0300b) obj3);
                if (ld9Var4 != null) {
                    ((pa2) ld9Var4).m19004a();
                }
                ui3Var.mo0a();
                return xfaVar;
            case 20:
                vi3 vi3Var5 = (vi3) obj3;
                ((t66) obj).setValue(Boolean.FALSE);
                String str2 = ((tn7) obj2).f62573c.f19240c;
                if (str2 == null) {
                    str2 = "";
                }
                vi3Var5.invoke(str2);
                return xfaVar;
            case 21:
                yq7 yq7Var = (yq7) obj3;
                ui3 ui3Var2 = (ui3) obj2;
                vi3 vi3Var6 = (vi3) obj;
                if (!yq7Var.f70295b) {
                    ui3Var2.mo0a();
                }
                vi3Var6.invoke(Boolean.valueOf(yq7Var.f70295b));
                return xfaVar;
            case 22:
                TooltipStep tooltipStep = (TooltipStep) obj3;
                ReaderPageFragment readerPageFragment = (ReaderPageFragment) obj2;
                xz7 xz7Var = (xz7) obj;
                vx7 vx7Var = ReaderPageFragment.Companion;
                if (tooltipStep == TooltipStep.TapBlueWord) {
                    readerPageFragment.m9299X0().m9312g3(xz7Var);
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((C2493a) obj3).m9389V2(ns7.f53201a);
                ((C1909e) obj2).m8760d3(n2aVar);
                ((ud6) obj).m22689f();
                return xfaVar;
            case 24:
                C2493a c2493a = (C2493a) obj3;
                C2256a c2256a = c2493a.f30229s;
                vi3 vi3Var7 = (vi3) obj2;
                yx4 yx4Var = ((kk0) ((t66) obj).getValue()).f47449b;
                if (yx4Var instanceof vx4) {
                    vx4 vx4Var = (vx4) yx4Var;
                    c2256a.m9247a(vx4Var.f66044a, vx4Var.f66046c, new ry7(c2493a, 6));
                } else if (yx4Var instanceof ux4) {
                    c2256a.f27858a.mo9326g2(xx4.f68925a);
                    vi3Var7.invoke(new uu7(((ux4) yx4Var).f64488c));
                }
                return xfaVar;
            case 25:
                vi3 vi3Var8 = (vi3) obj2;
                vi3 vi3Var9 = (vi3) obj;
                a89 a89Var = ((hx7) obj3).f43116e;
                if (a89Var instanceof y79) {
                    vi3Var8.invoke(new dv7(((y79) a89Var).f69419a));
                } else if (a89Var instanceof w79) {
                    vi3Var8.invoke(new dv7(((w79) a89Var).f66491a));
                } else {
                    vi3Var9.invoke(at7.f7470a);
                }
                return xfaVar;
            case 26:
                vi3 vi3Var10 = (vi3) obj2;
                vi3 vi3Var11 = (vi3) obj;
                if (((yz4) obj3).f70686t) {
                    vi3Var10.invoke(av7.f7574a);
                } else {
                    vi3Var11.invoke(ys7.f70426a);
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                vi3 vi3Var12 = (vi3) obj2;
                vi3 vi3Var13 = (vi3) obj;
                C2503b c2503b = ((C2493a) obj3).f30223m;
                c7a c7aVar = (c7a) c2503b.f30322k.getValue();
                TooltipStep tooltipStep2 = c7aVar != null ? c7aVar.f9664a : null;
                c7a c7aVar2 = (c7a) c2503b.f30322k.getValue();
                e28 e28Var = c7aVar2 != null ? c7aVar2.f9665b : null;
                c2503b.m9408d();
                int i2 = tooltipStep2 == null ? -1 : AbstractC2500f.f30283c[tooltipStep2.ordinal()];
                if (i2 == 1) {
                    xz7 xz7Var2 = c2503b.f30319h;
                    if (xz7Var2 != null && e28Var != null) {
                        vi3Var12.invoke(new ft7(xz7Var2, TokenType.NewWordOrPhraseType, false, e28Var));
                    }
                } else if (i2 == 2) {
                    vi3Var13.invoke(bv7.f9054a);
                } else if (i2 == 3) {
                    vi3Var12.invoke(ls7.f50078a);
                }
                return xfaVar;
            case 28:
                C2583a c2583a = (C2583a) obj3;
                c2583a.m9509V2(oqa.f54761a);
                c2583a.m9509V2(yqa.f70302a);
                ((C1909e) obj2).m8760d3(n2aVar);
                return Boolean.valueOf(((ud6) obj).m22689f());
            default:
                ((vi3) obj3).invoke((TokenMeaning) obj2);
                InterfaceC0300b.m1355a((InterfaceC0300b) obj);
                return xfaVar;
        }
    }

    public /* synthetic */ zg0(Object obj, Object obj2, Object obj3, int i) {
        this.f71511a = i;
        this.f71512b = obj;
        this.f71513c = obj2;
        this.f71514d = obj3;
    }
}
