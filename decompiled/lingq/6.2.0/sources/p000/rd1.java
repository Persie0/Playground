package p000;

import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.window.AbstractC0454b;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.premium.R$drawable;
import com.lingq.feature.more.R$string;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rd1 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59101a;

    public /* synthetic */ rd1(int i) {
        this.f59101a = i;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f59101a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ls3.m16526d(0, tj3Var, null, vz1.m23620a0(tj3Var, R$string.help_videos));
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var2, com.lingq.core.p012ui.R$string.ui_yes), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.core.p012ui.R$string.ui_no), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 3:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, ((fe9) tj3Var4.m22128k(zf1Var)).f38957f);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var4, 0);
                    int iHashCode = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m = tj3Var4.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var4, e16VarM21607T);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var4, zi3Var, bb1VarM230a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var4, zi3Var3, numValueOf);
                    vi3 vi3Var = C0352b.f4305h;
                    oha.m18000f(tj3Var4, vi3Var);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c);
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37240f, nj0.f52789H, tj3Var4, 54);
                    int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m2 = tj3Var4.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, e16VarM4412e);
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var4, zi3Var3, tj3Var4, vi3Var);
                    oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c2);
                    dn7.m10492a(null, 0L, 0.0f, 0L, 0, 0.0f, tj3Var4, 0, 63);
                    thb.m22044c(tj3Var4, c99.m4426s(b16Var, ((fe9) tj3Var4.m22128k(zf1Var)).f38956e));
                    lw9.m16554b(vz1.m23620a0(tj3Var4, com.lingq.feature.chat.R$string.feed_importing_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                    tj3Var4.m22139q(true);
                    tj3Var4.m22139q(true);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 4:
                ((Integer) obj3).getClass();
                ((InterfaceC0067f) obj).getClass();
                tj3 tj3Var5 = (tj3) ((ye1) obj2);
                Object objM22097O = tj3Var5.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = new C3288l7(7);
                    tj3Var5.m22131l0(objM22097O);
                }
                AbstractC0454b.m1895a((ui3) objM22097O, null, pqb.f56704f, tj3Var5, 390, 2);
                return xfaVar;
            case 5:
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var6 = (tj3) ye1Var5;
                if (tj3Var6.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    r9d.m20484f(R$drawable.ic_upgrade_imports_graphic, 0.0f, tj3Var6, 0, 2);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 6:
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var7 = (tj3) ye1Var6;
                if (tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var7, R$string.invite_friends_title), null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51800b.f71401e, tj3Var7, 0, 0, 130046);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 7:
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var8 = (tj3) ye1Var7;
                if (tj3Var8.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    tj3Var8.m22111b0(-763751238);
                    C3341mn c3341mn = new C3341mn();
                    int i2 = 0;
                    for (Object obj4 : vk9.m23365A0(vz1.m23620a0(tj3Var8, R$string.invite_friends_description), new String[]{"**"}, 0, 6)) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            vz1.m23628e0();
                            throw null;
                        }
                        String str = (String) obj4;
                        if (i2 % 2 == 1) {
                            int iM16932g = c3341mn.m16932g(new he9(0L, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                            try {
                                c3341mn.m16929d(str);
                                c3341mn.m16931f(iM16932g);
                            } catch (Throwable th) {
                                c3341mn.m16931f(iM16932g);
                                throw th;
                            }
                        } else {
                            c3341mn.m16929d(str);
                        }
                        i2 = i3;
                    }
                    C3419on c3419onM16933h = c3341mn.m16933h();
                    tj3Var8.m22139q(false);
                    lw9.m16555c(c3419onM16933h, null, 0L, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var8, 0, 0, 261118);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 8:
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var9 = (tj3) ye1Var8;
                if (tj3Var9.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var9, R$string.invite_friends), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var9, 0, 0, 262142);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 9:
                ye1 ye1Var9 = (ye1) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var10 = (tj3) ye1Var9;
                if (tj3Var10.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(AbstractC3584sr.m21607T(c99.m4414g(c99.m4412e(b16Var, 1.0f), 120.0f), ((fe9) tj3Var10.m22128k(ge9.f40637a)).f38956e), ((ms5) tj3Var10.m22128k(ps5.f56764b)).f51801c.f64857c), ((bx2) tj3Var10.m22128k(cx2.f34676a)).m4211d(), ss5.f61356d)), tj3Var10, 0);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 10:
                ye1 ye1Var10 = (ye1) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var11 = (tj3) ye1Var10;
                if (tj3Var11.m22099R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    String strM23620a0 = vz1.m23620a0(tj3Var11, com.lingq.feature.library.R$string.ui_understand);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(strM23620a0, null, ((ms5) tj3Var11.m22128k(vh9Var)).f51799a.f55844b, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var11.m22128k(vh9Var)).f51800b.f71409m, tj3Var11, 0, 0, 131066);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 11:
                ye1 ye1Var11 = (ye1) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var12 = (tj3) ye1Var11;
                if (tj3Var12.m22099R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    String strM23620a1 = vz1.m23620a0(tj3Var12, com.lingq.core.p012ui.R$string.ui_more);
                    vh9 vh9Var2 = ps5.f56764b;
                    vx9 vx9Var = ((ms5) tj3Var12.m22128k(vh9Var2)).f51800b.f71404h;
                    long j = ((ms5) tj3Var12.m22128k(vh9Var2)).f51799a.f55875s;
                    zf1 zf1Var2 = ge9.f40637a;
                    lw9.m16554b(strM23620a1, AbstractC3584sr.m21611X(b16.f7762a, 0.0f, ((fe9) tj3Var12.m22128k(zf1Var2)).f38952a, 0.0f, ((fe9) tj3Var12.m22128k(zf1Var2)).f38955d, 5), j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var12, 0, 0, 131064);
                } else {
                    tj3Var12.m22102U();
                }
                return xfaVar;
            case 12:
                ye1 ye1Var12 = (ye1) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var13 = (tj3) ye1Var12;
                if (tj3Var13.m22099R(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var13, com.lingq.core.p012ui.R$string.ui_done), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var13, 0, 0, 262142);
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case 13:
                ye1 ye1Var13 = (ye1) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var14 = (tj3) ye1Var13;
                if (tj3Var14.m22099R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var14, com.lingq.core.p012ui.R$string.ui_cancel), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var14, 0, 0, 262142);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
            case 14:
                ye1 ye1Var14 = (ye1) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var15 = (tj3) ye1Var14;
                if (tj3Var15.m22099R(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    cid.m4759j(vz1.m23620a0(tj3Var15, com.lingq.feature.statistics.R$string.stats_activity), tj3Var15, 0);
                } else {
                    tj3Var15.m22102U();
                }
                return xfaVar;
            case 15:
                ye1 ye1Var15 = (ye1) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var16 = (tj3) ye1Var15;
                if (tj3Var16.m22099R(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    yhd.m25146b(null, 9, null, tj3Var16, 48, 5);
                } else {
                    tj3Var16.m22102U();
                }
                return xfaVar;
            case 16:
                ye1 ye1Var16 = (ye1) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var17 = (tj3) ye1Var16;
                if (tj3Var17.m22099R(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    cid.m4759j(vz1.m23620a0(tj3Var17, com.lingq.feature.statistics.R$string.lingq_lessons), tj3Var17, 0);
                } else {
                    tj3Var17.m22102U();
                }
                return xfaVar;
            case 17:
                ye1 ye1Var17 = (ye1) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var18 = (tj3) ye1Var17;
                if (tj3Var18.m22099R(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    yhd.m25146b(null, 5, null, tj3Var18, 48, 5);
                } else {
                    tj3Var18.m22102U();
                }
                return xfaVar;
            case 18:
                ye1 ye1Var18 = (ye1) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var19 = (tj3) ye1Var18;
                if (tj3Var19.m22099R(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    cid.m4759j(vz1.m23620a0(tj3Var19, com.lingq.feature.statistics.R$string.lesson_edit_translations), tj3Var19, 0);
                } else {
                    tj3Var19.m22102U();
                }
                return xfaVar;
            case 19:
                ye1 ye1Var19 = (ye1) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var20 = (tj3) ye1Var19;
                if (tj3Var20.m22099R(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    yhd.m25146b(null, 3, null, tj3Var20, 48, 5);
                } else {
                    tj3Var20.m22102U();
                }
                return xfaVar;
            case 20:
                ye1 ye1Var20 = (ye1) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var21 = (tj3) ye1Var20;
                if (tj3Var21.m22099R(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    zf1 zf1Var3 = ge9.f40637a;
                    thb.m22044c(tj3Var21, c99.m4414g(b16Var, ((fe9) tj3Var21.m22128k(zf1Var3)).f38957f));
                    thb.m22044c(tj3Var21, c99.m4414g(b16Var, ((fe9) tj3Var21.m22128k(zf1Var3)).f38957f));
                } else {
                    tj3Var21.m22102U();
                }
                return xfaVar;
            case 21:
                ye1 ye1Var21 = (ye1) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var22 = (tj3) ye1Var21;
                if (tj3Var22.m22099R(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    yhd.m25146b(c99.m4412e(AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var22.m22128k(ge9.f40637a)).f38956e, 1), 1.0f), 4, ((ms5) tj3Var22.m22128k(ps5.f56764b)).f51801c.f64856b, tj3Var22, 48, 0);
                } else {
                    tj3Var22.m22102U();
                }
                return xfaVar;
            case 22:
                ye1 ye1Var22 = (ye1) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var23 = (tj3) ye1Var22;
                if (tj3Var23.m22099R(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    thb.m22044c(tj3Var23, c99.m4414g(b16Var, ((fe9) tj3Var23.m22128k(ge9.f40637a)).f38956e));
                } else {
                    tj3Var23.m22102U();
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ye1 ye1Var23 = (ye1) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var24 = (tj3) ye1Var23;
                if (tj3Var24.m22099R(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    zf1 zf1Var4 = ge9.f40637a;
                    e16 e16VarM4412e2 = c99.m4412e(AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var24.m22128k(zf1Var4)).f38956e, 1), 1.0f);
                    vh9 vh9Var3 = ps5.f56764b;
                    yhd.m25146b(e16VarM4412e2, 3, ((ms5) tj3Var24.m22128k(vh9Var3)).f51801c.f64856b, tj3Var24, 48, 0);
                    thb.m22044c(tj3Var24, c99.m4414g(b16Var, ((fe9) tj3Var24.m22128k(zf1Var4)).f38952a));
                    yhd.m25146b(c99.m4412e(AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var24.m22128k(zf1Var4)).f38956e, 1), 1.0f), 3, ((ms5) tj3Var24.m22128k(vh9Var3)).f51801c.f64856b, tj3Var24, 48, 0);
                } else {
                    tj3Var24.m22102U();
                }
                return xfaVar;
            case 24:
                ye1 ye1Var24 = (ye1) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var25 = (tj3) ye1Var24;
                if (tj3Var25.m22099R(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var25, com.lingq.feature.statistics.R$string.repair_streak), null, ((bx2) tj3Var25.m22128k(cx2.f34676a)).m4208a(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var25.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var25, 0, 0, 131066);
                } else {
                    tj3Var25.m22102U();
                }
                return xfaVar;
            case 25:
                ye1 ye1Var25 = (ye1) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var26 = (tj3) ye1Var25;
                if (tj3Var26.m22099R(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var26, com.lingq.core.p012ui.R$string.stats_calendar), null, ((bx2) tj3Var26.m22128k(cx2.f34676a)).m4208a(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var26.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var26, 0, 0, 131066);
                } else {
                    tj3Var26.m22102U();
                }
                return xfaVar;
            case 26:
                ye1 ye1Var26 = (ye1) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((vv4) obj).getClass();
                tj3 tj3Var27 = (tj3) ye1Var26;
                if (tj3Var27.m22099R(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    thb.m22044c(tj3Var27, c99.m4414g(b16Var, ((fe9) tj3Var27.m22128k(ge9.f40637a)).f38956e));
                } else {
                    tj3Var27.m22102U();
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ye1 ye1Var27 = (ye1) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var28 = (tj3) ye1Var27;
                if (tj3Var28.m22099R(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    cid.m4761l(tj3Var28, 0);
                } else {
                    tj3Var28.m22102U();
                }
                return xfaVar;
            case 28:
                ye1 ye1Var28 = (ye1) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var29 = (tj3) ye1Var28;
                if (tj3Var29.m22099R(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var29, com.lingq.core.p012ui.R$string.periods_today), AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var29.m22128k(ge9.f40637a)).f38957f, 1), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var29, 0, 0, 262140);
                } else {
                    tj3Var29.m22102U();
                }
                return xfaVar;
            default:
                ye1 ye1Var29 = (ye1) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var30 = (tj3) ye1Var29;
                if (tj3Var30.m22099R(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var30, com.lingq.core.p012ui.R$string.periods_all_time), AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var30.m22128k(ge9.f40637a)).f38957f, 1), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var30, 0, 0, 262140);
                } else {
                    tj3Var30.m22102U();
                }
                return xfaVar;
        }
    }
}
