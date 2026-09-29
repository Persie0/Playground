package p000;

import android.os.Parcel;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$plurals;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v7d {
    /* JADX INFO: renamed from: a */
    public static final void m23159a(d71 d71Var, ye1 ye1Var, int i) {
        LibraryItemCounter libraryItemCounter = d71Var.f35074b;
        LibraryItem libraryItem = d71Var.f35073a;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(738175059);
        int i2 = i | (tj3Var.m22124i(d71Var) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            r46.m20381f(c99.m4412e(b16Var, 1.0f), null, null, null, ci8.m4703P(-922563169, new se0(d71Var, 3), tj3Var), tj3Var, 24582, 14);
            tj3Var = tj3Var;
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM4412e2, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38955d, 0.0f, 0.0f, 13);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            vj8 vj8Var = vj8.f65508a;
            e16 e16VarMo12420a = vj8Var.mo12420a(1.0f, b16Var, true);
            String str = libraryItem.f19400A;
            if (str == null) {
                str = "";
            }
            m23160b(e16VarMo12420a, str, null, tj3Var, 0, 4);
            e16 e16VarMo12420a2 = vj8Var.mo12420a(1.0f, b16Var, true);
            int i3 = R$drawable.ic_collection_course_s;
            int i4 = R$plurals.lingq_lessons_count_Lessons;
            int i5 = libraryItemCounter.f19463i;
            m23160b(e16VarMo12420a2, vz1.m23612R(i4, i5, new Object[]{Integer.valueOf(i5)}, tj3Var), Integer.valueOf(i3), tj3Var, 0, 0);
            e16 e16VarMo12420a3 = vj8Var.mo12420a(1.0f, b16Var, true);
            int i6 = R$drawable.ic_headphones_s;
            Integer num = libraryItem.f19437i;
            String strM24810h = y02.m24810h((num != null ? num.intValue() : 0L) * 1000);
            if (vk9.m23391n0(strM24810h)) {
                strM24810h = "--:--:--";
            }
            m23160b(e16VarMo12420a3, strM24810h, Integer.valueOf(i6), tj3Var, 0, 0);
            e16 e16VarMo12420a4 = vj8Var.mo12420a(1.0f, b16Var, true);
            int i7 = R$drawable.ic_heart_s;
            int i8 = R$plurals.lingq_likes_count_like;
            int i9 = libraryItemCounter.f19462h;
            m23160b(e16VarMo12420a4, vz1.m23612R(i8, i9, new Object[]{Integer.valueOf(i9)}, tj3Var), Integer.valueOf(i7), tj3Var, 0, 0);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3368nd(d71Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m23160b(e16 e16Var, String str, Integer num, ye1 ye1Var, int i, int i2) {
        Integer num2;
        int i3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(456894056);
        int i4 = i | (tj3Var.m22120g(e16Var) ? 4 : 2) | (tj3Var.m22120g(str) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            num2 = num;
        } else {
            num2 = num;
            i3 = i4 | (tj3Var.m22120g(num2) ? 256 : 128);
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            Integer num3 = i5 != 0 ? null : num2;
            fc0 fc0Var = nj0.f52789H;
            zf1 zf1Var = ge9.f40637a;
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28)), fc0Var, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (num3 == null) {
                tj3Var.m22111b0(1425659936);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1425659937);
                y27 y27VarM18236U = AbstractC3423or.m18236U(num3.intValue(), tj3Var, 0);
                ((fe9) tj3Var.m22128k(zf1Var)).getClass();
                bq1.m4042R(y27VarM18236U, null, c99.m4426s(b16.f7762a, 16.0f), null, null, 0.0f, null, tj3Var, 56, 120);
                tj3Var.m22139q(false);
            }
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71408l, tj3Var, (i3 >> 3) & 14, 24960, 110590);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            num2 = num3;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(e16Var, str, num2, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static List m23161c(Parcel parcel) {
        String string = parcel.readString();
        if (string != null) {
            try {
                yf4 yf4Var = hg4.f42324a;
                KSerializer kSerializerSerializer = TokenMeaning.Companion.serializer();
                kSerializerSerializer.getClass();
                return (List) yf4Var.m10321a(string, new C2978ev(kSerializerSerializer));
            } catch (Exception unused) {
            }
        }
        return EmptyList.f47638a;
    }

    /* JADX INFO: renamed from: d */
    public static void m23162d(List list, Parcel parcel) {
        list.getClass();
        yf4 yf4Var = hg4.f42324a;
        KSerializer kSerializerSerializer = TokenMeaning.Companion.serializer();
        kSerializerSerializer.getClass();
        parcel.writeString(yf4Var.m10322b(new C2978ev(kSerializerSerializer), list));
    }
}
