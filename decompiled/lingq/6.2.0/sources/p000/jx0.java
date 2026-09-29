package p000;

import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.chat.AbstractC2005i;
import com.lingq.feature.token.R$drawable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jx0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46334a;

    public /* synthetic */ jx0(int i) {
        this.f46334a = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        String strM17734i;
        int i;
        String str;
        int i2 = this.f46334a;
        b16 b16Var = b16.f7762a;
        int i3 = 3;
        xfa xfaVar = xfa.f68157a;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2005i.m8903d((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 1:
                ((Integer) obj2).getClass();
                z6d.m25479b((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 2:
                ((Integer) obj2).getClass();
                b7d.m3413d((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 3:
                ((Integer) obj2).getClass();
                c7d.m4396a((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 4:
                ((Integer) obj2).getClass();
                b8d.m3487a((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                n71 n71Var = (n71) obj2;
                n71Var.getClass();
                if (n71Var instanceof g71) {
                    i = ((g71) n71Var).f40308a.f35073a.f19426a;
                    str = "course-header-";
                } else {
                    if (!(n71Var instanceof i71)) {
                        if (n71Var instanceof m71) {
                            Sort sort = ((m71) n71Var).f50694a.f55799a;
                            String value = sort.getValue();
                            if (value == null) {
                                value = sort.name();
                            }
                            strM17734i = AbstractC3393o1.m17734i("course-filter-", value);
                        } else if (n71Var instanceof k71) {
                            i = ((k71) n71Var).f46806a.f41930a.f19426a;
                            str = "lesson-";
                        } else if (n71Var instanceof l71) {
                            i = ((l71) n71Var).f49242a;
                            str = "lesson-loading-";
                        } else if (n71Var.equals(h71.f41856a)) {
                            strM17734i = "course-header-loading";
                        } else {
                            if (!n71Var.equals(j71.f45134a)) {
                                gm5.m12750e();
                                return null;
                            }
                            strM17734i = "empty";
                        }
                        return strM17734i + "-" + iIntValue;
                    }
                    i = ((i71) n71Var).f43615a.f38540a.f19426a;
                    str = "course-info-";
                }
                strM17734i = ux5.m22988k(i, str);
                return strM17734i + "-" + iIntValue;
            case 6:
                ((Integer) obj2).getClass();
                e8d.m10945d((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 7:
                ((Integer) obj2).getClass();
                e8d.m10942a((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 8:
                ((Integer) obj2).getClass();
                e8d.m10943b((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 9:
                String str2 = (String) obj;
                in1 in1Var = (in1) obj2;
                str2.getClass();
                in1Var.getClass();
                if (str2.length() == 0) {
                    return in1Var.toString();
                }
                return str2 + ", " + in1Var;
            case 10:
                String str3 = (String) obj;
                nn3 nn3Var = (nn3) obj2;
                if (str3.length() == 0) {
                    return nn3Var.toString();
                }
                return str3 + ", " + nn3Var;
            case 11:
                ye1 ye1Var = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 12:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.settings_dictionary_languages), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 13:
                ye1 ye1Var3 = (ye1) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    tj3 tj3Var3 = (tj3) ye1Var3;
                    if (tj3Var3.m22086D()) {
                        tj3Var3.m22102U();
                    }
                }
                return xfaVar;
            case 14:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var4, com.lingq.feature.library.R$string.archive_confirmation_title), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 15:
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ty3.m22351a(r7d.m20438b(), vz1.m23620a0(tj3Var5, com.lingq.feature.challenges.R$string.challenge_close), null, 0L, tj3Var5, 0, 12);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 16:
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var6, R$string.search_search), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var6, 0, 0, 262142);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 17:
                ye1 ye1Var7 = (ye1) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    tj3 tj3Var7 = (tj3) ye1Var7;
                    if (tj3Var7.m22086D()) {
                        tj3Var7.m22102U();
                    }
                }
                return xfaVar;
            case 18:
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var8, R$string.lingq_challenges), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var8, 0, 0, 262142);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 19:
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ty3.m22351a(AbstractC3423or.m18281u(), vz1.m23620a0(tj3Var9, R$string.ui_back), null, 0L, tj3Var9, 0, 12);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 20:
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ((fe9) tj3Var10.m22128k(ge9.f40637a)).getClass();
                    ty3.m22351a(h2d.m13016b(), null, c99.m4422o(b16Var, 32.0f), 0L, tj3Var10, 48, 8);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 21:
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var11, R$string.lingq_challenges), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var11, 0, 0, 262142);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 22:
                ye1 ye1Var12 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (tj3Var12.m22099R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ty3.m22351a(AbstractC3423or.m18281u(), vz1.m23620a0(tj3Var12, R$string.ui_back), null, 0L, tj3Var12, 0, 12);
                } else {
                    tj3Var12.m22102U();
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ye1 ye1Var13 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (tj3Var13.m22099R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var13, com.lingq.feature.chat.R$string.chat_title), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var13, 0, 0, 262142);
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case 24:
                ye1 ye1Var14 = (ye1) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (tj3Var14.m22099R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    AbstractC0218a.m1125e(snb.f61072a, null, null, null, 0.0f, null, null, null, null, tj3Var14, 6, 510);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
            case 25:
                ye1 ye1Var15 = (ye1) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (tj3Var15.m22099R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var15, com.lingq.feature.chat.R$string.chat_message_intro), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var15, 0, 0, 262142);
                } else {
                    tj3Var15.m22102U();
                }
                return xfaVar;
            case 26:
                ye1 ye1Var16 = (ye1) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                tj3 tj3Var16 = (tj3) ye1Var16;
                if (tj3Var16.m22099R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    Object objM22097O = tj3Var16.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AbstractC0278f.m1260j("");
                        tj3Var16.m22131l0(objM22097O);
                    }
                    ho9.m13414a(c99.m4412e(b16Var, 1.0f), null, 0L, 0L, 0.0f, 0.0f, null, ci8.m4703P(1213988917, new C0812bj(i3, (t66) objM22097O), tj3Var16), tj3Var16, 12582918, 126);
                } else {
                    tj3Var16.m22102U();
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ye1 ye1Var17 = (ye1) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                tj3 tj3Var17 = (tj3) ye1Var17;
                if (tj3Var17.m22099R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ty3.m22351a(r7d.m20438b(), vz1.m23620a0(tj3Var17, R$string.ui_close), c99.m4422o(b16Var, 16.0f), 0L, tj3Var17, 384, 8);
                } else {
                    tj3Var17.m22102U();
                }
                return xfaVar;
            case 28:
                ye1 ye1Var18 = (ye1) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                tj3 tj3Var18 = (tj3) ye1Var18;
                if (tj3Var18.m22099R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var18.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var18, 48);
                    int iHashCode = Long.hashCode(tj3Var18.f62385T);
                    l77 l77VarM22132m = tj3Var18.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var18, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var18.m22119f0();
                    if (tj3Var18.f62384S) {
                        tj3Var18.m22130l(ui3Var);
                    } else {
                        tj3Var18.m22137o0();
                    }
                    oha.m18001g(tj3Var18, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var18, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var18, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var18, C0352b.f4305h);
                    oha.m18001g(tj3Var18, C0352b.f4301d, e16VarM1322c);
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_lynx, tj3Var18, 0), null, c99.m4422o(b16Var, 24.0f), null, null, 0.0f, null, tj3Var18, 440, 120);
                    lw9.m16554b(vz1.m23620a0(tj3Var18, com.lingq.feature.chat.R$string.chat_title), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var18.m22128k(ps5.f56764b)).f51800b.f71405i, 0L, 0L, bc3.f8323i, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var18, 0, 0, 131070);
                    tj3Var18.m22139q(true);
                } else {
                    tj3Var18.m22102U();
                }
                return xfaVar;
            default:
                ye1 ye1Var19 = (ye1) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                tj3 tj3Var19 = (tj3) ye1Var19;
                if (tj3Var19.m22099R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ty3.m22351a(r7d.m20438b(), vz1.m23620a0(tj3Var19, R$string.ui_close), null, 0L, tj3Var19, 0, 12);
                } else {
                    tj3Var19.m22102U();
                }
                return xfaVar;
        }
    }

    public /* synthetic */ jx0(int i, int i2) {
        this.f46334a = i2;
    }
}
