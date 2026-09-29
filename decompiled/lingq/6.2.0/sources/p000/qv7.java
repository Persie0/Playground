package p000;

import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.C0068g;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.library.C1469k;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.user.Referral;
import com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment;
import com.lingq.feature.review.views.unscrambler.SentenceBuilderView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qv7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58252a;

    public /* synthetic */ qv7(int i) {
        this.f58252a = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        String upperCase;
        dr2 dr2Var = null;
        dr2Var = null;
        switch (this.f58252a) {
            case 0:
                ox7 ox7Var = (ox7) obj;
                ox7Var.getClass();
                return new z91(ox7Var.f55132e, 0);
            case 1:
                dr5 dr5Var = (dr5) obj;
                dr5Var.getClass();
                return dr5Var.m10612c();
            case 2:
                xz7 xz7Var = (xz7) obj;
                xz7Var.getClass();
                return xz7Var.f69008e;
            case 3:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 4:
                ((Integer) obj).getClass();
                return xfa.f68157a;
            case 5:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT `photo` FROM (SELECT * FROM ReferralEntity ORDER BY dateJoined DESC LIMIT 5)");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList.add(new Referral(ik8VarMo2873e0.isNull(0) ? null : ik8VarMo2873e0.mo2875L(0)));
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 6:
                zbb zbbVar = (zbb) obj;
                zbbVar.getClass();
                d57 d57Var = w78.f66487e;
                return Boolean.valueOf(tr3.m22268i(zbbVar.f71322a));
            case 7:
                i41 i41Var = (i41) obj;
                bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
                i41Var.getClass();
                return i41Var.f43475b ? "____" : i41Var.f43474a;
            case 8:
                ((Integer) obj).getClass();
                List list = xb8.f68031a;
                return -500;
            case 9:
                ((Integer) obj).getClass();
                List list2 = xb8.f68031a;
                return 500;
            case 10:
                i41 i41Var2 = (i41) obj;
                i41Var2.getClass();
                return i41Var2.f43475b ? "____" : i41Var2.f43474a;
            case 11:
                String str = (String) obj;
                str.getClass();
                return str;
            case 12:
                ((C3189km) obj).getClass();
                return new C0068g(AbstractC0070i.m772g(ss5.m21703b0(220, 0, null, 6), 0.0f, 2), AbstractC0070i.m773h(ss5.m21703b0(180, 0, null, 6), 2));
            case 13:
                we8 we8Var = (we8) obj;
                we8Var.getClass();
                return we8Var.f66727a;
            case 14:
                ((Integer) obj).getClass();
                return -500;
            case 15:
                obj.getClass();
                List list3 = (List) obj;
                Object obj2 = list3.get(0);
                Boolean bool = obj2 != null ? (Boolean) obj2 : null;
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                Object obj3 = list3.get(1);
                fs6 fs6Var = lda.f49512e;
                if (!fa4.m11650l(obj3, Boolean.FALSE) && obj3 != null) {
                    dr2Var = (dr2) ((vi3) fs6Var.f39591c).invoke(obj3);
                }
                dr2Var.getClass();
                return new a97(dr2Var.f36076a, zBooleanValue);
            case 16:
                obj.getClass();
                return new dr2(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                return new hc5(((Integer) obj).intValue());
            case 18:
                obj.getClass();
                List list4 = (List) obj;
                Object obj4 = list4.get(0);
                zw9 zw9Var = (fa4.m11650l(obj4, Boolean.FALSE) || obj4 == null) ? null : (zw9) ((vi3) lda.f49515h.f39591c).invoke(obj4);
                zw9Var.getClass();
                int i = zw9Var.f72322a;
                Object obj5 = list4.get(1);
                Boolean bool2 = obj5 != null ? (Boolean) obj5 : null;
                bool2.getClass();
                return new ax9(i, bool2.booleanValue());
            case 19:
                obj.getClass();
                return new zw9(((Integer) obj).intValue());
            case 20:
                LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) obj;
                librarySearchQuery.getClass();
                if (!librarySearchQuery.f19480b.isEmpty()) {
                    return librarySearchQuery;
                }
                C1469k c1469k = LibrarySearchQuery.Companion;
                int iOrdinal = LearningLevel.Beginner1.ordinal();
                int iOrdinal2 = LearningLevel.Advanced2.ordinal();
                c1469k.getClass();
                return LibrarySearchQuery.m8091a(librarySearchQuery, null, C1469k.m8095a(iOrdinal, iOrdinal2), null, null, null, null, null, false, 8189);
            case 21:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() <= 0) {
                    return str2;
                }
                StringBuilder sb = new StringBuilder();
                char cCharAt = str2.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    String strValueOf = String.valueOf(cCharAt);
                    strValueOf.getClass();
                    Locale locale = Locale.ROOT;
                    upperCase = strValueOf.toUpperCase(locale);
                    upperCase.getClass();
                    if (upperCase.length() <= 1) {
                        upperCase = String.valueOf(Character.toTitleCase(cCharAt));
                    } else if (cCharAt != 329) {
                        char cCharAt2 = upperCase.charAt(0);
                        String lowerCase = upperCase.substring(1).toLowerCase(locale);
                        lowerCase.getClass();
                        upperCase = cCharAt2 + lowerCase;
                    }
                } else {
                    upperCase = str2;
                }
                sb.append((Object) upperCase);
                sb.append(str2.substring(1));
                return sb.toString();
            case 22:
                gq6 gq6Var = (gq6) obj;
                long j = gq6Var.f41189a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new C2970en(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (gq6Var.f41189a & 4294967295L))) : gv8.f41396a;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                C2970en c2970en = (C2970en) obj;
                return new gq6((((long) Float.floatToRawIntBits(c2970en.f37540b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c2970en.f37539a)) << 32));
            case 24:
                String str3 = (String) obj;
                int i2 = SentenceBuilderView.f32801j;
                str3.getClass();
                return vk9.m23376L0(str3).toString();
            case 25:
                String str4 = (String) obj;
                int i3 = SentenceBuilderView.f32801j;
                str4.getClass();
                return vk9.m23376L0(str4).toString();
            case 26:
                String str5 = (String) obj;
                str5.getClass();
                return vk9.m23376L0(str5).toString();
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                String str6 = (String) obj;
                str6.getClass();
                return vk9.m23376L0(str6).toString();
            case 28:
                String str7 = (String) obj;
                str7.getClass();
                return vk9.m23376L0(str7).toString();
            default:
                zaa zaaVar = (zaa) obj;
                zaaVar.getClass();
                return AbstractC3393o1.m17734i("translation_", zaaVar.f71294a);
        }
    }
}
