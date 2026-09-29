package com.lingq.feature.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.glance.appwidget.AbstractC0652b;
import androidx.glance.appwidget.AbstractC0659g;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.playlist.C1521d;
import com.lingq.feature.widget.layout.collections.layout.AbstractC2868d;
import com.lingq.feature.widget.layout.network.PlaylistLessonImageWorker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3064h6;
import p000.AbstractC3550rv;
import p000.AbstractC3584sr;
import p000.C2953e6;
import p000.C2990f6;
import p000.C3386nv;
import p000.bk2;
import p000.cma;
import p000.do7;
import p000.e99;
import p000.ef7;
import p000.gm5;
import p000.h04;
import p000.j4b;
import p000.ky1;
import p000.l55;
import p000.lo6;
import p000.mfd;
import p000.myc;
import p000.pwc;
import p000.r46;
import p000.rd7;
import p000.sd7;
import p000.ss5;
import p000.td7;
import p000.tg9;
import p000.tj3;
import p000.u91;
import p000.ud7;
import p000.ux5;
import p000.v91;
import p000.vk9;
import p000.vma;
import p000.vz1;
import p000.wd7;
import p000.x18;
import p000.x74;
import p000.xd7;
import p000.xfa;
import p000.ye1;
import p000.yf1;

/* JADX INFO: renamed from: com.lingq.feature.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2863a extends AbstractC0659g {

    /* JADX INFO: renamed from: b */
    public final e99 f33833b = new e99(AbstractC3550rv.m20855w0(new bk2[]{new bk2(AbstractC3584sr.m21614a(256.0f, 115.0f)), new bk2(AbstractC3584sr.m21614a(260.0f, 180.0f))}));

    @Override // androidx.glance.appwidget.AbstractC0659g
    /* JADX INFO: renamed from: c */
    public final e99 mo2234c() {
        return this.f33833b;
    }

    @Override // androidx.glance.appwidget.AbstractC0659g
    /* JADX INFO: renamed from: d */
    public final Object mo2235d(Context context, Continuation continuation) throws Throwable {
        CoroutineSingletons coroutineSingletonsM9776i = m9776i(context, (ContinuationImpl) continuation);
        return coroutineSingletonsM9776i == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineSingletonsM9776i : xfa.f68157a;
    }

    @Override // androidx.glance.appwidget.AbstractC0659g
    /* JADX INFO: renamed from: e */
    public final Object mo2236e(Context context, int i, Continuation continuation) throws Throwable {
        CoroutineSingletons coroutineSingletonsM9776i = m9776i(context, (ContinuationImpl) continuation);
        return coroutineSingletonsM9776i == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineSingletonsM9776i : xfa.f68157a;
    }

    /* JADX INFO: renamed from: h */
    public final void m9775h(List list, Playlist playlist, ye1 ye1Var, int i) {
        boolean z;
        List listM23604J;
        Bitmap bitmapM16809a;
        Bitmap bitmapM16809a2;
        int size;
        list.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-31870717);
        int i2 = i | (tj3Var.m22124i(list) ? 4 : 2) | (tj3Var.m22124i(playlist) ? 32 : 16);
        if (!tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22102U();
        } else if (list.isEmpty()) {
            tj3Var.m22111b0(-272617454);
            x74.m24344a(R$string.loading_add_to_playlist, Integer.valueOf(com.lingq.core.p012ui.R$drawable.ic_playlist_icon), com.lingq.core.p012ui.R$string.ui_add, com.lingq.core.p012ui.R$drawable.ic_add, false, r46.m20385j("open library"), r46.m20385j("open app"), tj3Var, 0, 16);
            tj3Var = tj3Var;
            tj3Var.m22139q(false);
        } else {
            boolean z2 = false;
            tj3Var.m22111b0(-271973274);
            Context context = (Context) tj3Var.m22128k(yf1.f69763b);
            int iM21693T = ss5.m21693T(68.0f * context.getResources().getDisplayMetrics().density);
            List<td7> list2 = list;
            int i3 = 0;
            for (td7 td7Var : list2) {
                if (td7Var instanceof sd7) {
                    size = 1;
                } else {
                    if (!(td7Var instanceof rd7)) {
                        gm5.m12750e();
                        return;
                    }
                    size = ((rd7) td7Var).m20588a().size();
                }
                i3 += size;
            }
            if (i3 < 1) {
                i3 = 1;
            }
            int iMin = Math.min(iM21693T, mfd.m16810b(mfd.m16811c(context), i3).getWidth());
            String strM8116a = playlist != null ? playlist.m8116a() : null;
            if (strM8116a == null) {
                tj3Var.m22111b0(-562940758);
                strM8116a = vz1.m23620a0(tj3Var, R$string.lingq_playlist);
            } else {
                tj3Var.m22111b0(-562941533);
            }
            tj3Var.m22139q(false);
            int i4 = com.lingq.core.p012ui.R$drawable.ic_playlist_icon;
            String str = strM8116a;
            int i5 = com.lingq.core.designsystem.R$drawable.ic_lingq;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.lingq.com/library"));
            intent.setPackage("com.linguist");
            intent.setFlags(268468224);
            tg9 tg9Var = new tg9(intent, AbstractC3064h6.m13073a((C2990f6[]) Arrays.copyOf(new C2990f6[0], 0)));
            tj3Var.m22111b0(-562924556);
            ArrayList arrayList = new ArrayList();
            for (td7 td7Var2 : list2) {
                boolean z3 = td7Var2 instanceof sd7;
                C2953e6 c2953e6 = pwc.f56933a;
                String str2 = "lesson_uri_";
                if (z3) {
                    tj3Var.m22111b0(362483789);
                    ud7 ud7VarM15819a = ((sd7) td7Var2).m21252a().m15819a();
                    Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey("lesson_uri_" + ud7VarM15819a.m22694c());
                    tj3Var.m22113c0(1333953144);
                    tj3Var.m22113c0(-534706435);
                    Object objM22128k = tj3Var.m22128k(yf1.f69764c);
                    if (objM22128k == null) {
                        C3386nv.m17635v("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
                        return;
                    }
                    tj3Var.m22139q(false);
                    Object obj = ((Preferences) objM22128k).get(keyStringKey);
                    tj3Var.m22139q(false);
                    String str3 = (String) obj;
                    if (str3 != null) {
                        bitmapM16809a2 = mfd.m16809a(context, Uri.parse(str3), iMin, iMin);
                    } else {
                        String strM22695d = ud7VarM15819a.m22695d();
                        if (strM22695d == null) {
                            strM22695d = "";
                        }
                        if (!vk9.m23391n0(strM22695d)) {
                            wd7 wd7Var = PlaylistLessonImageWorker.Companion;
                            int iM22694c = ud7VarM15819a.m22694c();
                            wd7Var.getClass();
                            wd7.m23853a(iM22694c, context, strM22695d);
                        }
                        bitmapM16809a2 = null;
                    }
                    String strValueOf = String.valueOf(ud7VarM15819a.m22694c());
                    String strM22696e = ud7VarM15819a.m22696e();
                    String strM22693b = ud7VarM15819a.m22693b();
                    listM23604J = vz1.m23604J(new h04(strValueOf, strM22696e, strM22693b == null ? "" : strM22693b, bitmapM16809a2, myc.m17157a(AbstractC3064h6.m13073a((C2990f6[]) Arrays.copyOf(new C2990f6[]{c2953e6.m10862b(Integer.valueOf(ud7VarM15819a.m22694c()))}, 1)))));
                    z = false;
                    tj3Var.m22139q(false);
                } else {
                    if (!(td7Var2 instanceof rd7)) {
                        throw ux5.m23001x(tj3Var, -403947852, false);
                    }
                    tj3Var.m22111b0(364376339);
                    List listM20588a = ((rd7) td7Var2).m20588a();
                    ArrayList arrayList2 = new ArrayList(v91.m23189q0(listM20588a, 10));
                    Iterator it = listM20588a.iterator();
                    while (it.hasNext()) {
                        ud7 ud7VarM15819a2 = ((l55) it.next()).m15819a();
                        Iterator it2 = it;
                        Preferences.Key<String> keyStringKey2 = PreferencesKeys.stringKey(str2 + ud7VarM15819a2.m22694c());
                        tj3Var.m22113c0(1333953144);
                        tj3Var.m22113c0(-534706435);
                        Object objM22128k2 = tj3Var.m22128k(yf1.f69764c);
                        if (objM22128k2 == null) {
                            C3386nv.m17635v("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
                            return;
                        }
                        String str4 = str2;
                        tj3Var.m22139q(false);
                        Object obj2 = ((Preferences) objM22128k2).get(keyStringKey2);
                        tj3Var.m22139q(false);
                        String str5 = (String) obj2;
                        if (str5 != null) {
                            bitmapM16809a = mfd.m16809a(context, Uri.parse(str5), iMin, iMin);
                        } else {
                            String strM22695d2 = ud7VarM15819a2.m22695d();
                            if (strM22695d2 == null) {
                                strM22695d2 = "";
                            }
                            if (!vk9.m23391n0(strM22695d2)) {
                                wd7 wd7Var2 = PlaylistLessonImageWorker.Companion;
                                int iM22694c2 = ud7VarM15819a2.m22694c();
                                wd7Var2.getClass();
                                wd7.m23853a(iM22694c2, context, strM22695d2);
                            }
                            bitmapM16809a = null;
                        }
                        String strValueOf2 = String.valueOf(ud7VarM15819a2.m22694c());
                        String strM22696e2 = ud7VarM15819a2.m22696e();
                        String strM22693b2 = ud7VarM15819a2.m22693b();
                        arrayList2.add(new h04(strValueOf2, strM22696e2, strM22693b2 == null ? "" : strM22693b2, bitmapM16809a, myc.m17157a(AbstractC3064h6.m13073a((C2990f6[]) Arrays.copyOf(new C2990f6[]{c2953e6.m10862b(Integer.valueOf(ud7VarM15819a2.m22694c()))}, 1)))));
                        it = it2;
                        str2 = str4;
                    }
                    z = false;
                    tj3Var.m22139q(false);
                    listM23604J = arrayList2;
                }
                u91.m22630w0(listM23604J, arrayList);
                z2 = z;
            }
            boolean z4 = z2;
            tj3Var.m22139q(z4);
            AbstractC2868d.m9783d(str, i4, i5, tg9Var, arrayList, tj3Var, 3072);
            tj3Var.m22139q(z4);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 7, this, list, playlist);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final CoroutineSingletons m9776i(Context context, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistWidget$setupWidget$1 playlistWidget$setupWidget$1;
        if (continuationImpl instanceof PlaylistWidget$setupWidget$1) {
            playlistWidget$setupWidget$1 = (PlaylistWidget$setupWidget$1) continuationImpl;
            int i = playlistWidget$setupWidget$1.f33822c;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistWidget$setupWidget$1.f33822c = i - Integer.MIN_VALUE;
            } else {
                playlistWidget$setupWidget$1 = new PlaylistWidget$setupWidget$1(this, continuationImpl);
            }
        } else {
            playlistWidget$setupWidget$1 = new PlaylistWidget$setupWidget$1(this, continuationImpl);
        }
        Object obj = playlistWidget$setupWidget$1.f33820a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistWidget$setupWidget$1.f33822c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            ky1 ky1Var = (ky1) ((j4b) do7.m10537m(context, j4b.class));
            C0282a c0282a = new C0282a(-1363266433, true, new ef7((cma) ky1Var.f48596D.get(), new C1521d((xd7) ky1Var.f48629N.get(), (vma) ky1Var.f48623L.get()), context, ky1Var.m15729c(), this, 0));
            playlistWidget$setupWidget$1.f33822c = 1;
            if (AbstractC0652b.m2217b(c0282a, playlistWidget$setupWidget$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }
}
