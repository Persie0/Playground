package p000;

import android.content.res.Resources;
import androidx.activity.compose.C0033a;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.dao.C1322j;
import com.lingq.core.database.entity.LibraryCounterEntity;
import com.lingq.core.database.entity.MilestoneMetEntity;
import com.lingq.core.database.entity.MilestoneStatsEntity;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.player.data.PlayerState;
import com.lingq.core.player.data.PlayerType;
import com.lingq.feature.playlist.C2255e;
import com.lingq.feature.playlist.PlaylistActionMenuItem;
import com.lingq.feature.playlist.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.sequences.AbstractC3204c;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h85 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41943a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f41944b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f41945c;

    public /* synthetic */ h85(String str, C1321i c1321i) {
        this.f41943a = 2;
        this.f41945c = str;
        this.f41944b = c1321i;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x03be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x03c0 A[LOOP:1: B:137:0x038a->B:147:0x03c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x03c8 A[SYNTHETIC] */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        r86 r86VarMo10902c;
        int i = this.f41943a;
        int i2 = 5;
        int i3 = 4;
        int i4 = 2;
        int i5 = 3;
        int i6 = 1;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f41945c;
        Object obj3 = this.f41944b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ((C1321i) obj3).f17040Q.m3840V(bk8Var, (ArrayList) obj2);
                return xfaVar;
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ((C1321i) obj3).f17036M.m21729K(bk8Var2, (LibraryCounterEntity) obj2);
                return xfaVar;
            case 2:
                String str = (String) obj2;
                C1321i c1321i = (C1321i) obj3;
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e0 = bk8Var3.mo2873e0("SELECT `pinned`, `pinnedHard`, `tabs`, `code`, `id`, `title`, `order`, `originalTitle` FROM (SELECT * FROM LibraryShelfEntity WHERE language = ? AND pinned = 1 ORDER BY `order` DESC LIMIT 1)");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    return ik8VarMo2873e0.mo2876a0() ? new LibraryShelf(((int) ik8VarMo2873e0.getLong(0)) != 0, ((int) ik8VarMo2873e0.getLong(1)) != 0, c1321i.f17038O.m20057L(ik8VarMo2873e0.mo2875L(2)), ik8VarMo2873e0.mo2875L(3), (int) ik8VarMo2873e0.getLong(4), ik8VarMo2873e0.mo2875L(5), (int) ik8VarMo2873e0.getLong(6), ik8VarMo2873e0.mo2875L(7)) : null;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 3:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                return Long.valueOf(((C1321i) obj3).f17037N.m3842X(bk8Var4, (u85) obj2));
            case 4:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ((C1321i) obj3).f17042S.m3841W(bk8Var5, (v85) obj2);
                return xfaVar;
            case 5:
                List list = (List) obj3;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                vu4Var.m23547h(list.size(), new ue0(15, new ry4(12), list), new C3520r2(21, list), new C0282a(802480018, true, new jq0(list, (b85) obj2, i6)));
                return xfaVar;
            case 6:
                dh9 dh9Var = (dh9) obj2;
                q98 q98Var = (q98) obj;
                q98Var.getClass();
                q98Var.m19813c(((mn5) obj3).f51562d ? ((Number) dh9Var.getValue()).floatValue() : 1.0f);
                return xfaVar;
            case 7:
                a31 a31Var = (a31) obj;
                a31Var.getClass();
                a31Var.m56a("key", ((KSerializer) obj3).getDescriptor());
                a31Var.m56a("value", ((KSerializer) obj2).getDescriptor());
                return xfaVar;
            case 8:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ((uy5) obj3).f64536M.m3841W(bk8Var6, (MilestoneMetEntity) obj2);
                return xfaVar;
            case 9:
                bk8 bk8Var7 = (bk8) obj;
                bk8Var7.getClass();
                return ((uy5) obj3).f64535L.m3843Y(bk8Var7, (ArrayList) obj2);
            case 10:
                bk8 bk8Var8 = (bk8) obj;
                bk8Var8.getClass();
                ((uy5) obj3).f64537N.m3841W(bk8Var8, (MilestoneStatsEntity) obj2);
                return xfaVar;
            case 11:
                long jFloatValue = (long) ((Float) obj).floatValue();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                ((vi3) obj3).invoke(new eb7(timeUnit.toMillis(jFloatValue)));
                ((vi3) obj2).invoke(new mbb((int) timeUnit.toMillis(jFloatValue)));
                return xfaVar;
            case 12:
                ((f56) obj3).f38436c.add(new c56(obj, (yv8) obj2));
                return xfaVar;
            case 13:
                f56 f56Var = (f56) obj2;
                if (((Set) obj3).contains(obj)) {
                    n66 n66Var = f56Var.f38435b;
                    o66 o66Var = f56Var.f38437d;
                    Object objM17255g = n66Var.m17255g(obj);
                    if (objM17255g != null) {
                        if (objM17255g instanceof o66) {
                            o66 o66Var2 = (o66) objM17255g;
                            Object[] objArr = o66Var2.f1303b;
                            long[] jArr = o66Var2.f1302a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i7 = 0;
                                while (true) {
                                    long j = jArr[i7];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                                        for (int i9 = 0; i9 < i8; i9++) {
                                            if ((255 & j) < 128) {
                                                o66Var.m17811d((yv8) objArr[(i7 << 3) + i9]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i8 == 8) {
                                            if (i7 != length) {
                                                i7++;
                                            }
                                        }
                                    } else if (i7 != length) {
                                        i7++;
                                    }
                                }
                            }
                        } else {
                            o66Var.m17811d((yv8) objM17255g);
                        }
                    }
                }
                return xfaVar;
            case 14:
                k66 k66Var = (k66) obj3;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((xc9) k66Var.f46767c).setValue(k66Var.m14918a());
                ((vi3) obj2).invoke(bool);
                return xfaVar;
            case 15:
                k66 k66Var2 = (k66) obj3;
                ((ai2) obj).getClass();
                k66Var2.f46768d = (hp5) obj2;
                return new C3531rd(k66Var2, i2);
            case 16:
                r86 r86Var = (r86) obj3;
                h86 h86Var = ((ud6) obj2).f63760b;
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                xp7 xp7Var = xd6Var.f68100a;
                xp7Var.f68498b = 0;
                xp7Var.f68499c = 0;
                if (r86Var instanceof u86) {
                    int i10 = r86.f58879f;
                    for (r86 r86Var2 : AbstractC3204c.m15418n0(r86Var, new tf4(25))) {
                        r86 r86VarM13127f = h86Var.m13127f();
                        if (fa4.m11650l(r86Var2, r86VarM13127f != null ? r86VarM13127f.f58882c : null)) {
                        }
                    }
                    int i11 = u86.f63588h;
                    xd6Var.f68103d = wfb.m23917l(h86Var.m13128g()).f58881b.f57368b;
                    xd6Var.f68104e = false;
                    xd6Var.f68105f = true;
                }
                return xfaVar;
            case 17:
                kj6 kj6Var = (kj6) obj3;
                wd6 wd6Var = (wd6) obj2;
                y76 y76Var = (y76) obj;
                y76Var.getClass();
                a86 a86Var = y76Var.f69415h;
                r86 r86Var3 = y76Var.f69409b;
                if (r86Var3 == null) {
                    r86Var3 = null;
                }
                if (r86Var3 == null || (r86VarMo10902c = kj6Var.mo10902c(r86Var3, a86Var.m170a(), wd6Var)) == null) {
                    return null;
                }
                return r86VarMo10902c.equals(r86Var3) ? y76Var : kj6Var.m15273b().m10154b(r86VarMo10902c, r86VarMo10902c.m20439d(a86Var.m170a()));
            case 18:
                ((pg9) obj3).mo4537a(null);
                ((kl7) ((ll7) obj2)).mo4677k((hk1) obj);
                return xfaVar;
            case 19:
                bk8 bk8Var9 = (bk8) obj;
                bk8Var9.getClass();
                return ((dn6) obj3).f35898L.m3843Y(bk8Var9, (ArrayList) obj2);
            case 20:
                vu4 vu4Var2 = (vu4) obj;
                vu4Var2.getClass();
                List list2 = ((mo6) obj3).f51637a;
                vu4Var2.m23547h(list2.size(), null, new C3520r2(23, list2), new C0282a(802480018, true, new df2(i4, (vi3) obj2, list2)));
                return xfaVar;
            case 21:
                ((zi3) obj3).invoke(Integer.valueOf(((ej7) obj).f37341a), Integer.valueOf(((sq5) obj2).m21574p().f52220b));
                return xfaVar;
            case 22:
                AbstractC3572sf abstractC3572sf = (AbstractC3572sf) obj3;
                rb5 rb5Var = (rb5) obj2;
                ((ai2) obj).getClass();
                abstractC3572sf.mo21323g(rb5Var);
                return new j91(i5, abstractC3572sf, rb5Var);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                bk8 bk8Var10 = (bk8) obj;
                bk8Var10.getClass();
                ((C1322j) obj3).f17050P.m3841W(bk8Var10, (sx4) obj2);
                return xfaVar;
            case 24:
                bk8 bk8Var11 = (bk8) obj;
                bk8Var11.getClass();
                ((C1322j) obj3).f17049O.m3840V(bk8Var11, (List) obj2);
                return xfaVar;
            case 25:
                bk8 bk8Var12 = (bk8) obj;
                bk8Var12.getClass();
                ((C1322j) obj3).f17049O.m3841W(bk8Var12, (bd7) obj2);
                return xfaVar;
            case 26:
                C2255e c2255e = (C2255e) obj3;
                vi3 vi3Var = (vi3) obj2;
                pb7 pb7Var = (pb7) obj;
                pb7Var.getClass();
                if (pb7Var instanceof eb7) {
                    float f = ((eb7) pb7Var).f36980a;
                    if (f == -1.0f) {
                        c2255e.getClass();
                    } else {
                        c2255e.f27845v.m8452Q((int) f);
                    }
                } else if (pb7Var instanceof ha7) {
                    c2255e.f27845v.m8464c0(((int) ((ha7) pb7Var).f42094a) * DescriptorProtos.Edition.EDITION_2023_VALUE);
                } else if (pb7Var instanceof ka7) {
                    c2255e.f27845v.m8462b0((long) (((ka7) pb7Var).f46946a * 1000.0f));
                } else if (pb7Var.equals(za7.f71289a)) {
                    tb7 tb7VarM12625d = c2255e.f27845v.f21961n.m12625d();
                    int i12 = tb7VarM12625d != null ? tb7VarM12625d.f62101a : 0;
                    if (c2255e.m9242d3(i12)) {
                        c2255e.m9245g3(i12);
                    } else {
                        c2255e.f27845v.m8442C(ea7.f36943k);
                    }
                } else if (pb7Var.equals(ib7.f43904a)) {
                    c2255e.f27845v.m8442C(ea7.f36947o);
                } else if (pb7Var.equals(fa7.f38723a)) {
                    c2255e.f27845v.m8442C(ea7.f36936d);
                } else if (pb7Var.equals(qa7.f57501a)) {
                    c2255e.f27845v.m8442C(ea7.f36938f);
                } else if (pb7Var.equals(pa7.f55893a)) {
                    tb7 tb7VarM12625d2 = c2255e.f27845v.f21961n.m12625d();
                    int i13 = tb7VarM12625d2 != null ? tb7VarM12625d2.f62101a : 0;
                    if (c2255e.m9242d3(i13)) {
                        c2255e.m9245g3(i13);
                    } else {
                        vi3Var.invoke(new ji6(i13, ((hc7) ((C3244l) c2255e.f27845v.f21946D.f9311a).getValue()).f42173a == PlayerType.Video));
                    }
                } else if (pb7Var.equals(kb7.f46977a)) {
                    c2255e.f27845v.m8442C(ea7.f36944l);
                } else if (pb7Var.equals(na7.f52539a)) {
                    c2255e.f27845v.m8457V();
                } else if (pb7Var.equals(ta7.f62054a)) {
                    PlayerState playerState = PlayerState.Paused;
                    c2255e.getClass();
                    playerState.getClass();
                    c2255e.f27845v.m8465d0(playerState, false);
                } else {
                    if (!pb7Var.equals(wa7.f66565a)) {
                        gm5.m12750e();
                        return null;
                    }
                    PlayerState playerState2 = PlayerState.Playing;
                    c2255e.getClass();
                    playerState2.getClass();
                    c2255e.f27845v.m8465d0(playerState2, false);
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                Resources resources = (Resources) obj3;
                vi3 vi3Var2 = (vi3) obj2;
                String str2 = (String) obj;
                str2.getClass();
                if (str2.equals(resources.getString(R$string.texts_download_all))) {
                    vi3Var2.invoke(new uc7(PlaylistActionMenuItem.DownloadAll));
                } else if (str2.equals(resources.getString(com.lingq.core.p012ui.R$string.content_archive))) {
                    vi3Var2.invoke(new uc7(PlaylistActionMenuItem.Archive));
                } else if (str2.equals(resources.getString(R$string.playlists_enable_downloads)) || str2.equals(resources.getString(R$string.playlists_disable_downloads))) {
                    vi3Var2.invoke(new uc7(PlaylistActionMenuItem.DisableDownloads));
                } else {
                    vi3Var2.invoke(new uc7(PlaylistActionMenuItem.RemoveFiles));
                }
                return xfaVar;
            case 28:
                y60 y60Var = (y60) obj3;
                C0033a c0033a = (C0033a) obj2;
                y60Var.m24951a(c0033a);
                return new j91(i3, y60Var, c0033a);
            default:
                fb2 fb2Var = (fb2) obj3;
                e28 e28Var = (e28) obj;
                e28Var.getClass();
                float fMo912g0 = fb2Var.mo912g0(35.0f);
                float f2 = e28Var.f36622c;
                ((vi3) obj2).invoke(new hs7(new e28(f2 - fMo912g0, Float.intBitsToFloat((int) (e28Var.m10803d() & 4294967295L)) - fb2Var.mo912g0(20.0f), f2 - fb2Var.mo912g0(3.0f), fb2Var.mo912g0(50.0f) + Float.intBitsToFloat((int) (e28Var.m10803d() & 4294967295L)))));
                return xfaVar;
        }
    }

    public /* synthetic */ h85(int i, Object obj, Object obj2) {
        this.f41943a = i;
        this.f41944b = obj;
        this.f41945c = obj2;
    }
}
