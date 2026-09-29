package p000;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.database.dao.C1313a;
import com.lingq.core.database.dao.C1315c;
import com.lingq.core.database.dao.C1316d;
import com.lingq.core.database.dao.C1317e;
import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.database.entity.ChallengeRankingEntity;
import com.lingq.core.database.entity.ChatHistoryEntity;
import com.lingq.core.database.entity.ChatStatsEntity;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.player.data.PlayerState;
import com.lingq.core.player.data.PlayerType;
import com.lingq.feature.challenges.ChallengeDetailsFragment;
import com.lingq.feature.challenges.R$string;
import com.lingq.feature.chat.C2009m;
import com.lingq.feature.collections.C2034d;
import com.lingq.feature.playlist.C2251a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s70 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f60445b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f60446c;

    public /* synthetic */ s70(List list, tx0 tx0Var) {
        this.f60444a = 20;
        this.f60446c = list;
        this.f60445b = tx0Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f60444a;
        LqAnalyticsValues$LessonPath.Unknown unknown = LqAnalyticsValues$LessonPath.Unknown.f14315a;
        int i2 = 0;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f60446c;
        Object obj3 = this.f60445b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                return ((C1313a) obj3).f16997L.m3843Y(bk8Var, (List) obj2);
            case 1:
                df0 df0Var = (df0) obj3;
                vi3 vi3Var = (vi3) obj2;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                vu4.m23545g(vu4Var, null, new C0282a(-1311365062, true, new qe0(vi3Var, i2)), 3);
                vu4.m23545g(vu4Var, null, new C0282a(-1995067599, true, new re0(df0Var, vi3Var, i2)), 3);
                boolean z = df0Var.f35541f;
                pya pyaVar = df0Var.f35539d;
                if (z) {
                    vu4.m23545g(vu4Var, null, enb.f37581c, 3);
                }
                u4d.m22469d(vu4Var, R$string.challenge_find_in_library, df0Var.f35537b, pyaVar != null ? Integer.valueOf(pyaVar.f57001a) : null, "library", vi3Var);
                u4d.m22469d(vu4Var, R$string.challenge_find_in_imported_courses, df0Var.f35538c, pyaVar != null ? Integer.valueOf(pyaVar.f57001a) : null, "imports", vi3Var);
                vu4.m23545g(vu4Var, null, new C0282a(1939439986, true, new re0(vi3Var, df0Var)), 3);
                vu4.m23545g(vu4Var, null, enb.f37582d, 3);
                vu4.m23545g(vu4Var, null, new C0282a(1218520564, true, new re0(df0Var, vi3Var, 2)), 3);
                return xfaVar;
            case 2:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                return ((un0) obj3).f64105O.m3843Y(bk8Var2, (List) obj2);
            case 3:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ((un0) obj3).f64103M.m21729K(bk8Var3, (wn0) obj2);
                return xfaVar;
            case 4:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                return Long.valueOf(((un0) obj3).f64105O.m3842X(bk8Var4, (CardEntity) obj2));
            case 5:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ((un0) obj3).f64102L.m21730L(bk8Var5, (ArrayList) obj2);
                return xfaVar;
            case 6:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ((yp0) obj3).f70234L.m21729K(bk8Var6, (ChallengeRankingEntity) obj2);
                return xfaVar;
            case 7:
                bk8 bk8Var7 = (bk8) obj;
                bk8Var7.getClass();
                ((yp0) obj3).f70236N.m3840V(bk8Var7, (ArrayList) obj2);
                return xfaVar;
            case 8:
                bk8 bk8Var8 = (bk8) obj;
                bk8Var8.getClass();
                return Long.valueOf(((yp0) obj3).f70235M.m3842X(bk8Var8, (gr0) obj2));
            case 9:
                bk8 bk8Var9 = (bk8) obj;
                bk8Var9.getClass();
                ((yp0) obj3).f70238P.m3841W(bk8Var9, (hs0) obj2);
                return xfaVar;
            case 10:
                ChallengeDetailsFragment challengeDetailsFragment = (ChallengeDetailsFragment) obj3;
                t66 t66Var = (t66) obj2;
                er0 er0Var = (er0) obj;
                bh4[] bh4VarArr = ChallengeDetailsFragment.f24346G0;
                er0Var.getClass();
                if (er0Var instanceof cr0) {
                    if (((fr0) t66Var.getValue()).f39504b instanceof qs0) {
                        w41 w41Var = challengeDetailsFragment.f24350F0;
                        if (w41Var == null) {
                            fa4.m11636J("navGraphController");
                            throw null;
                        }
                        rs0 rs0Var = ((fr0) t66Var.getValue()).f39504b;
                        rs0Var.getClass();
                        boolean z2 = ((qs0) rs0Var).f58119a.f18862j;
                        ef0 ef0Var = ((fr0) t66Var.getValue()).f39508f;
                        boolean z3 = ef0Var != null && ef0Var.f37160b;
                        Integer num = ((cr0) er0Var).f34396a;
                        w41Var.m23737z(new o96(num != null ? num.intValue() : -1, z2, z3));
                    }
                } else if (er0Var instanceof dr0) {
                    w41 w41Var2 = challengeDetailsFragment.f24350F0;
                    if (w41Var2 == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    dr0 dr0Var = (dr0) er0Var;
                    w41Var2.m23737z(new s96(dr0Var.f36074a, unknown, "", dr0Var.f36075b));
                } else {
                    if (!er0Var.equals(br0.f8879a)) {
                        gm5.m12750e();
                        return null;
                    }
                    b34.m3244j(challengeDetailsFragment).m22689f();
                }
                return xfaVar;
            case 11:
                bk8 bk8Var10 = (bk8) obj;
                bk8Var10.getClass();
                ((C1315c) obj3).f17009S.m3841W(bk8Var10, (qw0) obj2);
                return xfaVar;
            case 12:
                bk8 bk8Var11 = (bk8) obj;
                bk8Var11.getClass();
                return Long.valueOf(((C1315c) obj3).f17002L.m3842X(bk8Var11, (ChatHistoryEntity) obj2));
            case 13:
                bk8 bk8Var12 = (bk8) obj;
                bk8Var12.getClass();
                ((C1315c) obj3).f17011U.m3841W(bk8Var12, (ay4) obj2);
                return xfaVar;
            case 14:
                bk8 bk8Var13 = (bk8) obj;
                bk8Var13.getClass();
                ((C1315c) obj3).f17010T.m3841W(bk8Var13, (ow0) obj2);
                return xfaVar;
            case 15:
                bk8 bk8Var14 = (bk8) obj;
                bk8Var14.getClass();
                ((C1315c) obj3).f17005O.m3841W(bk8Var14, (ChatStatsEntity) obj2);
                return xfaVar;
            case 16:
                bk8 bk8Var15 = (bk8) obj;
                bk8Var15.getClass();
                ((C1315c) obj3).f17006P.m3841W(bk8Var15, (mw0) obj2);
                return xfaVar;
            case 17:
                String str = (String) obj3;
                C1315c c1315c = (C1315c) obj2;
                bk8 bk8Var16 = (bk8) obj;
                bk8Var16.getClass();
                ik8 ik8VarMo2873e0 = bk8Var16.mo2873e0("SELECT * FROM ChatHistoryEntity WHERE targetLanguage = ? AND id != -1 ORDER BY startedAt DESC");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "title");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "image");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "coins");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "targetLanguage");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "dictionaryLanguage");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "startedAt");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "updatedAt");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "history");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList.add(new ChatHistoryEntity((int) ik8VarMo2873e0.getLong(iM14108v), ik8VarMo2873e0.mo2875L(iM14108v2), ik8VarMo2873e0.mo2875L(iM14108v3), ik8VarMo2873e0.getDouble(iM14108v4), ik8VarMo2873e0.mo2875L(iM14108v5), ik8VarMo2873e0.mo2875L(iM14108v6), ik8VarMo2873e0.mo2875L(iM14108v7), ik8VarMo2873e0.mo2875L(iM14108v8), c1315c.f17003M.m20054I(ik8VarMo2873e0.mo2875L(iM14108v9))));
                    }
                    ik8VarMo2873e0.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 18:
                int iIntValue = ((Integer) obj).intValue();
                ((C2009m) obj3).m8925b3();
                ((w41) obj2).m23737z(new ja6(iIntValue, 0, "", unknown));
                return xfaVar;
            case 19:
                zu8 zu8Var = (zu8) obj;
                zu8Var.getClass();
                ((jv0) obj3).mo8874H(((jw0) obj2).f46240a.f18920a, new xz7(0, 0, 0, 0, u91.m22596N0(zu8Var.f72191a, " ", null, null, new C3013ft(8), 30), 0, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262127), zu8Var.f72193c);
                return xfaVar;
            case 20:
                tx0 tx0Var = (tx0) obj3;
                lw0 lw0Var = (lw0) ((List) obj2).get(((Integer) obj).intValue());
                if (!(lw0Var instanceof jw0)) {
                    if (lw0Var instanceof kw0) {
                        return AbstractC3393o1.m17732g(tx0Var.f63041f, "_thinking");
                    }
                    gm5.m12750e();
                    return null;
                }
                int i3 = tx0Var.f63041f;
                ChatMessage chatMessage = ((jw0) lw0Var).f46240a;
                return i3 + "_msg-" + chatMessage.f18920a + "_" + chatMessage.f18921b;
            case 21:
                zu8 zu8Var2 = (zu8) obj;
                zu8Var2.getClass();
                ((jv0) obj3).mo8874H(((ChatMessage) obj2).f18920a, new xz7(0, 0, 0, 0, u91.m22596N0(zu8Var2.f72191a, " ", null, null, new C3013ft(7), 30), 0, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262127), zu8Var2.f72193c);
                return xfaVar;
            case 22:
                t66 t66Var2 = (t66) obj2;
                rw9 rw9Var = (rw9) obj;
                rw9Var.getClass();
                if (!((f71) obj3).f38546g) {
                    t66Var2.setValue(Boolean.valueOf(rw9Var.m20957d()));
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                C2034d c2034d = (C2034d) obj3;
                t61 t61Var = (t61) obj2;
                m61 m61Var = (m61) obj;
                m61Var.getClass();
                if (m61Var.equals(j61.f45108a)) {
                    c2034d.m8945Z2(new i51(t61Var.f61899b));
                } else if (m61Var.equals(i61.f43578a)) {
                    c2034d.m8945Z2(new g51(t61Var.f61899b, t61Var.f61898a));
                } else if (m61Var.equals(k61.f46756a)) {
                    c2034d.m8945Z2(new j51(t61Var.f61899b));
                } else {
                    if (!m61Var.equals(l61.f49108a)) {
                        gm5.m12750e();
                        return null;
                    }
                    c2034d.m8945Z2(new k51(t61Var.f61899b));
                }
                c2034d.m8945Z2(n51.f52357a);
                return xfaVar;
            case 24:
                bk8 bk8Var17 = (bk8) obj;
                bk8Var17.getClass();
                return Long.valueOf(((C1316d) obj3).f17013L.m3842X(bk8Var17, (s91) obj2));
            case 25:
                bk8 bk8Var18 = (bk8) obj;
                bk8Var18.getClass();
                return Long.valueOf(((io1) obj3).f44344L.m3842X(bk8Var18, (u85) obj2));
            case 26:
                C2251a c2251a = (C2251a) obj3;
                vi3 vi3Var2 = (vi3) obj2;
                pb7 pb7Var = (pb7) obj;
                pb7Var.getClass();
                if (pb7Var instanceof eb7) {
                    float f = ((eb7) pb7Var).f36980a;
                    if (f == -1.0f) {
                        c2251a.getClass();
                    } else {
                        c2251a.f27784m.m8452Q((int) f);
                    }
                } else if (pb7Var instanceof ha7) {
                    c2251a.f27784m.m8464c0(((int) ((ha7) pb7Var).f42094a) * DescriptorProtos.Edition.EDITION_2023_VALUE);
                } else if (pb7Var instanceof ka7) {
                    c2251a.f27784m.m8462b0((long) (((ka7) pb7Var).f46946a * 1000.0f));
                } else if (pb7Var.equals(za7.f71289a)) {
                    tb7 tb7VarM12625d = c2251a.f27784m.f21961n.m12625d();
                    i2 = tb7VarM12625d != null ? tb7VarM12625d.f62101a : 0;
                    if (c2251a.m9207Z2(i2)) {
                        c2251a.m9209b3(i2);
                    } else {
                        c2251a.f27784m.m8442C(ea7.f36943k);
                    }
                } else if (pb7Var.equals(ib7.f43904a)) {
                    c2251a.f27784m.m8442C(ea7.f36947o);
                } else if (pb7Var.equals(fa7.f38723a)) {
                    c2251a.f27784m.m8442C(ea7.f36936d);
                } else if (pb7Var.equals(qa7.f57501a)) {
                    c2251a.f27784m.m8442C(ea7.f36938f);
                } else if (pb7Var.equals(pa7.f55893a)) {
                    tb7 tb7VarM12625d2 = c2251a.f27784m.f21961n.m12625d();
                    int i4 = tb7VarM12625d2 != null ? tb7VarM12625d2.f62101a : 0;
                    if (c2251a.m9207Z2(i4)) {
                        c2251a.m9209b3(i4);
                    } else {
                        vi3Var2.invoke(new ji6(i4, ((hc7) ((C3244l) c2251a.f27784m.f21946D.f9311a).getValue()).f42173a == PlayerType.Video));
                    }
                } else if (pb7Var.equals(kb7.f46977a)) {
                    c2251a.f27784m.m8442C(ea7.f36944l);
                } else if (pb7Var.equals(na7.f52539a)) {
                    c2251a.f27784m.m8457V();
                } else if (pb7Var.equals(ta7.f62054a)) {
                    PlayerState playerState = PlayerState.Paused;
                    c2251a.getClass();
                    playerState.getClass();
                    c2251a.f27784m.m8465d0(playerState, false);
                } else {
                    if (!pb7Var.equals(wa7.f66565a)) {
                        gm5.m12750e();
                        return null;
                    }
                    PlayerState playerState2 = PlayerState.Playing;
                    c2251a.getClass();
                    playerState2.getClass();
                    c2251a.f27784m.m8465d0(playerState2, false);
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                bk8 bk8Var19 = (bk8) obj;
                bk8Var19.getClass();
                ((C1317e) obj3).f17020g.m3841W(bk8Var19, (dt1) obj2);
                return xfaVar;
            case 28:
                vi0 vi0Var = (vi0) obj2;
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                interfaceC0310a.getClass();
                InterfaceC0310a.m1418s0(interfaceC0310a, (xc5) obj3, 0L, 0L, 0.0f, null, null, 0, 126);
                if (vi0Var != null) {
                    InterfaceC0310a.m1418s0(interfaceC0310a, vi0Var, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                return xfaVar;
            default:
                bk8 bk8Var20 = (bk8) obj;
                bk8Var20.getClass();
                ((rb2) obj3).f59017b.m20400B(bk8Var20, (kb2) obj2);
                return xfaVar;
        }
    }

    public /* synthetic */ s70(int i, Object obj, Object obj2) {
        this.f60444a = i;
        this.f60445b = obj;
        this.f60446c = obj2;
    }
}
