package p000;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.animation.core.C0059a;
import androidx.compose.foundation.style.C0159d;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.library.C1469k;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.settings.C1873e;
import com.lingq.core.settings.R$id;
import com.lingq.core.settings.ReaderSettingsFragment;
import com.lingq.core.settings.SettingsFragment;
import com.lingq.core.settings.ViewKeys;
import com.lingq.core.settings.review.ReviewSettingsFragment;
import com.lingq.feature.reader.reader.C2493a;
import com.lingq.feature.reader.video.C2583a;
import com.lingq.feature.review.ReviewFragment;
import com.lingq.feature.review.views.speaking.AudioMatchView;
import com.lingq.feature.review.views.speaking.MatchPairView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cg7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10018b;

    public /* synthetic */ cg7(cg7 cg7Var, vi3 vi3Var) {
        this.f10017a = 26;
        this.f10018b = cg7Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        yw4 yw4Var;
        Object value;
        int i = this.f10017a;
        boolean z = true;
        fa1 fa1Var = null;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f10018b;
        switch (i) {
            case 0:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return serialDescriptor.mo3698f(iIntValue) + ": " + serialDescriptor.mo3700i(iIntValue).mo3694a();
            case 1:
                a31 a31Var = (a31) obj;
                a31Var.getClass();
                a31Var.m56a("type", sk9.f60960b);
                a31Var.m56a("value", pb1.m19042l("kotlinx.serialization.Polymorphic<" + ((xg7) obj2).f68183a.m25414c() + '>', cy8.f34711y, new SerialDescriptor[0]));
                a31Var.f164b = EmptyList.f47638a;
                return xfaVar;
            case 2:
                int iIntValue2 = ((Integer) obj).intValue();
                return iIntValue2 + "_" + ((ox7) ((yz4) obj2).f70670d.get(iIntValue2)).f55131d;
            case 3:
                ((C2493a) obj2).m9389V2(new gt7(((Integer) obj).intValue()));
                return xfaVar;
            case 4:
                ReaderSettingsFragment readerSettingsFragment = (ReaderSettingsFragment) obj2;
                lz7 lz7Var = (lz7) obj;
                lz7Var.getClass();
                if (lz7Var.equals(lz7.f50354a)) {
                    b34.m3244j(readerSettingsFragment).m22689f();
                    return xfaVar;
                }
                gm5.m12750e();
                return null;
            case 5:
                ((C2583a) obj2).m9509V2(new mra(((Integer) obj).intValue()));
                return xfaVar;
            case 6:
                Activity activity = (Activity) obj2;
                ((ai2) obj).getClass();
                Window window = activity != null ? activity.getWindow() : null;
                Integer numValueOf = window != null ? Integer.valueOf(window.getNavigationBarColor()) : null;
                if (window != null) {
                    window.setNavigationBarColor(-16777216);
                }
                return new j91(7, numValueOf, window);
            case 7:
                ((c28) obj2).m4286a((uo2) obj);
                return xfaVar;
            case 8:
                ReviewFragment reviewFragment = (ReviewFragment) obj2;
                xd8 xd8Var = (xd8) obj;
                xd8Var.getClass();
                if (xd8Var.equals(td8.f62167a)) {
                    b34.m3244j(reviewFragment).m22689f();
                } else if (xd8Var.equals(ud8.f63791a)) {
                    w41 w41Var = reviewFragment.f31744B0;
                    if (w41Var == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    w41Var.m23737z(new la6());
                } else if (!(xd8Var instanceof vd8)) {
                    if (!(xd8Var instanceof wd8)) {
                        gm5.m12750e();
                        return null;
                    }
                    mbd.m16755c(reviewFragment.m2089Q(), ((wd8) xd8Var).f66658a, null, 30);
                }
                return xfaVar;
            case 9:
                MatchPairView matchPairView = (MatchPairView) obj;
                matchPairView.getClass();
                matchPairView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ArrayList<md8> arrayList = ((nd8) obj2).f52624a;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                for (md8 md8Var : arrayList) {
                    arrayList2.add(new vq5(md8Var.f51108a, md8Var.f51109b));
                }
                matchPairView.setup(arrayList2);
                return xfaVar;
            case 10:
                ReviewSettingsFragment reviewSettingsFragment = (ReviewSettingsFragment) obj2;
                sf8 sf8Var = (sf8) obj;
                sf8Var.getClass();
                if (sf8Var instanceof rf8) {
                    nf8 nf8Var = of8.Companion;
                    ViewKeys viewKeys = ((rf8) sf8Var).f59207a;
                    nf8Var.getClass();
                    viewKeys.getClass();
                    wc6.Companion.getClass();
                    jfa.m14428k(b34.m3244j(reviewSettingsFragment), new uc6(viewKeys), null);
                } else {
                    if (!sf8Var.equals(qf8.f57704a)) {
                        gm5.m12750e();
                        return null;
                    }
                    b34.m3244j(reviewSettingsFragment).m22689f();
                }
                return xfaVar;
            case 11:
                fg8 fg8Var = (fg8) obj2;
                AudioMatchView audioMatchView = (AudioMatchView) obj;
                audioMatchView.getClass();
                audioMatchView.m9660p(fg8Var.f39077a, fg8Var.f39078b);
                return xfaVar;
            case 12:
                xg3 xg3Var = (xg3) obj;
                xg3Var.getClass();
                ((sb2) obj2).f60619i = xg3Var;
                return xfaVar;
            case 13:
                ik8 ik8Var = (ik8) obj;
                ik8Var.getClass();
                ((cg7) obj2).invoke(new yc0(ik8Var, 0));
                return xfaVar;
            case 14:
                ei8 ei8Var = (ei8) obj2;
                ik8 ik8Var2 = (ik8) obj;
                ik8Var2.getClass();
                int i2 = ei8Var.f37298g;
                if (1 <= i2) {
                    int i3 = 1;
                    while (true) {
                        int i4 = ei8Var.f37297f[i3];
                        if (i4 == 1) {
                            ik8Var2.mo2880m(i3);
                        } else if (i4 == 2) {
                            ik8Var2.mo2878j(i3, ei8Var.f37293b[i3]);
                        } else if (i4 == 3) {
                            ik8Var2.mo2877g(i3, ei8Var.f37294c[i3]);
                        } else if (i4 == 4) {
                            String str = ei8Var.f37295d[i3];
                            if (str == null) {
                                C3386nv.m17626m("Required value was null.");
                                return null;
                            }
                            ik8Var2.mo2874C(i3, str);
                        } else if (i4 == 5) {
                            byte[] bArr = ei8Var.f37296e[i3];
                            if (bArr == null) {
                                C3386nv.m17626m("Required value was null.");
                                return null;
                            }
                            ik8Var2.mo2879k(i3, bArr);
                        }
                        if (i3 != i2) {
                            i3++;
                        }
                    }
                }
                return xfaVar;
            case 15:
                Pair pair = (Pair) obj2;
                LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) obj;
                librarySearchQuery.getClass();
                Map map = librarySearchQuery.f19480b;
                if (!map.isEmpty()) {
                    Collection collectionValues = map.values();
                    if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        Iterator it = collectionValues.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                return librarySearchQuery;
                            }
                        }
                    }
                }
                C1469k c1469k = LibrarySearchQuery.Companion;
                int iOrdinal = ((LearningLevel) pair.f47623a).ordinal();
                int iOrdinal2 = ((LearningLevel) pair.f47624b).ordinal();
                c1469k.getClass();
                return LibrarySearchQuery.m8091a(librarySearchQuery, null, C1469k.m8095a(iOrdinal, iOrdinal2), null, null, null, null, null, false, 8189);
            case 16:
                LibrarySearchQuery librarySearchQuery2 = (LibrarySearchQuery) obj;
                librarySearchQuery2.getClass();
                return LibrarySearchQuery.m8091a(librarySearchQuery2, null, null, (Sort) obj2, null, null, null, null, false, 8183);
            case 17:
                x44 x44Var = (x44) obj2;
                kg7 kg7Var = (kg7) obj;
                long j = kg7Var.f47237c;
                C0205f c0205f = (C0205f) x44Var.f67753d;
                if (!c0205f.m1111l() || c0205f.m1114o().f65990a.f54604b.length() == 0 || (yw4Var = c0205f.f3079d) == null || yw4Var.m25363d() == null) {
                    z = false;
                } else {
                    x44Var.m24267d(c0205f.m1114o(), j, false, p84.f55747i);
                }
                if (z) {
                    kg7Var.m15189a();
                }
                return xfaVar;
            case 18:
                ((cd4) obj2).mo4537a(null);
                return xfaVar;
            case 19:
                SettingsFragment settingsFragment = (SettingsFragment) obj2;
                vg6 vg6Var = (vg6) obj;
                vg6Var.getClass();
                if (vg6Var instanceof qi6) {
                    vc6 vc6Var = wc6.Companion;
                    ViewKeys viewKeys2 = ((qi6) vg6Var).f57820a;
                    vc6Var.getClass();
                    jfa.m14428k(b34.m3244j(settingsFragment), vc6.m23229a(viewKeys2), null);
                } else if (vg6Var.equals(ni6.f52758a)) {
                    ud6 ud6VarM3244j = b34.m3244j(settingsFragment);
                    k19.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToLessonSettings), null);
                } else if (vg6Var.equals(pi6.f56251a)) {
                    ud6 ud6VarM3244j2 = b34.m3244j(settingsFragment);
                    k19.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j2, new C2916d6(R$id.actionToNotificationsSettings), null);
                } else if (vg6Var.equals(tg6.f62255a)) {
                    b34.m3244j(settingsFragment).m22689f();
                } else if (vg6Var.equals(mi6.f51359a)) {
                    ob1 ob1Var = settingsFragment.f22652B0;
                    if (ob1Var == null) {
                        fa4.m11636J("utils");
                        throw null;
                    }
                    ob1Var.m17888a(settingsFragment.m2089Q());
                } else if (vg6Var.equals(li6.f49718a)) {
                    id3 id3VarM2089Q = settingsFragment.m2089Q();
                    b34.m3244j(settingsFragment);
                    mbd.m16755c(id3VarM2089Q, "https://forum.lingq.com/t/how-to-remove-courses-or-content-sources-from-your-library-feed/87124", null, 26);
                } else if (vg6Var instanceof oi6) {
                    oi6 oi6Var = (oi6) vg6Var;
                    if (oi6Var.f54376a) {
                        id3 id3VarM2089Q2 = settingsFragment.m2089Q();
                        b34.m3244j(settingsFragment);
                        mbd.m16755c(id3VarM2089Q2, "https://www.lingq.com", null, 26);
                    } else if (oi6Var.f54377b) {
                        w41 w41Var2 = settingsFragment.f22653C0;
                        if (w41Var2 == null) {
                            fa4.m11636J("navGraphController");
                            throw null;
                        }
                        w41Var2.m23737z(new pa6(LqAnalyticsValues$UpgradePopupSource.SettingsButtonClick.getValue(), 14, null));
                    } else {
                        ud6 ud6VarM3244j3 = b34.m3244j(settingsFragment);
                        k19.Companion.getClass();
                        jfa.m14428k(ud6VarM3244j3, new C2916d6(R$id.actionToManageSubs), null);
                    }
                } else if (vg6Var.equals(ri6.f59364a)) {
                    w41 w41Var3 = settingsFragment.f22653C0;
                    if (w41Var3 == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    w41Var3.m23737z(new pa6(LqAnalyticsValues$UpgradePopupSource.TranscriptionLimit.getValue(), 12, null));
                }
                return xfaVar;
            case 20:
                C1873e c1873e = (C1873e) obj2;
                String str2 = (String) obj;
                C3244l c3244l = c1873e.f22974n;
                do {
                    value = c3244l.getValue();
                    ((Boolean) value).getClass();
                } while (!c3244l.m15570h(value, Boolean.FALSE));
                if (str2 != null) {
                    c1873e.f22964d.mo8243R1(new qe6(new he6(str2, pe6.f56006a)));
                }
                return xfaVar;
            case 21:
                return Boolean.valueOf(fa4.m11650l(((bz2) obj).m4237c(), (sb9) obj2));
            case 22:
                q98 q98Var = (q98) obj;
                em9 em9VarM1057e1 = C0159d.m1057e1((C0159d) obj2, 4);
                q98Var.m19813c(em9VarM1057e1.m11249s((byte) 21) ? em9VarM1057e1.f37478H : 1.0f);
                q98Var.m19823p(em9VarM1057e1.m11249s((byte) 22) ? em9VarM1057e1.f37479I : 1.0f);
                q98Var.m19824q(em9VarM1057e1.m11249s((byte) 23) ? em9VarM1057e1.f37480J : 1.0f);
                q98Var.m19810A(em9VarM1057e1.m11249s((byte) 24) ? em9VarM1057e1.f37481K : 0.0f);
                q98Var.m19811D(em9VarM1057e1.m11249s((byte) 25) ? em9VarM1057e1.f37482L : 0.0f);
                q98Var.m19820l(em9VarM1057e1.m11249s((byte) 26) ? em9VarM1057e1.f37483M : 0.0f);
                q98Var.m19821m(em9VarM1057e1.m11249s((byte) 27) ? em9VarM1057e1.f37484N : 0.0f);
                q98Var.m19822n(em9VarM1057e1.m11249s((byte) 28) ? em9VarM1057e1.f37485O : 0.0f);
                if (em9VarM1057e1.m11250t(54)) {
                    fa1Var = em9VarM1057e1.f37490T;
                    fa1Var.getClass();
                }
                q98Var.m19817g(fa1Var);
                long jM18157m = k9a.f46915b;
                if (em9VarM1057e1.m11249s((byte) 29) || em9VarM1057e1.m11249s((byte) 30)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM18157m >> 32));
                    if (em9VarM1057e1.m11249s((byte) 29)) {
                        fIntBitsToFloat = em9VarM1057e1.f37486P;
                    }
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM18157m & 4294967295L));
                    if (em9VarM1057e1.m11249s((byte) 30)) {
                        fIntBitsToFloat2 = em9VarM1057e1.f37487Q;
                    }
                    jM18157m = omd.m18157m(fIntBitsToFloat, fIntBitsToFloat2);
                }
                q98Var.m19828x(jM18157m);
                q98Var.m19816f(em9VarM1057e1.m11249s((byte) 31) ? em9VarM1057e1.f37474D : false);
                o39 o39Var = ss5.f61356d;
                if (em9VarM1057e1.m11250t(53)) {
                    o39Var = em9VarM1057e1.f37475E;
                }
                q98Var.m19826s(o39Var);
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((fb2) obj).getClass();
                return new f84(((long) ss5.m21693T(((Number) ((C0059a) obj2).m745d()).floatValue())) << 32);
            case 24:
                Drawable drawable = (Drawable) obj2;
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                ym0 ym0VarM16515r = interfaceC0310a.mo603o0().m16515r();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)), (int) Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)));
                drawable.draw(AbstractC3497qg.m19936a(ym0VarM16515r));
                return xfaVar;
            case 25:
                ((vi3) obj).invoke((at9) obj2);
                return xfaVar;
            case 26:
                cg7 cg7Var = (cg7) obj2;
                pba pbaVar = (pba) obj;
                if (pbaVar instanceof C3787y8) {
                    cg7Var.invoke(((C3787y8) pbaVar).f69455J);
                    return Boolean.TRUE;
                }
                C3386nv.m17633t("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                String str3 = (String) obj;
                str3.getClass();
                ((ArrayList) obj2).add(str3);
                return xfaVar;
            case 28:
                zi3 zi3Var = (zi3) obj2;
                n84 n84Var = (n84) obj;
                if (!(n84Var != null ? n84.m17279a(n84Var.f52482a, 0L) : false)) {
                    zi3Var.invoke(Boolean.TRUE, n84Var);
                }
                return xfaVar;
            default:
                b6a b6aVar = (b6a) obj;
                b6aVar.getClass();
                return Boolean.valueOf(b6aVar.m3373c().m24947b() == ((b6a) obj2).m3373c().m24947b());
        }
    }

    public /* synthetic */ cg7(Object obj, int i) {
        this.f10017a = i;
        this.f10018b = obj;
    }
}
