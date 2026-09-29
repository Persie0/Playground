package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.sequences.AbstractC3204c;
import okio.ByteString;
import p000.C3386nv;
import p000.fa4;
import p000.iy5;
import p000.pm2;
import p000.u91;
import p000.ux5;
import p000.ux8;
import p000.vk9;
import p000.vm2;
import p000.vz1;
import p000.z91;

/* JADX INFO: renamed from: okhttp3.internal.publicsuffix.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3415c {

    /* JADX INFO: renamed from: b */
    public static final ByteString f54509b = new ByteString(Arrays.copyOf(new byte[]{42}, 1));

    /* JADX INFO: renamed from: c */
    public static final List f54510c = vz1.m23604J("*");

    /* JADX INFO: renamed from: d */
    public static final C3415c f54511d = new C3415c(AbstractC3416d.m18071a());

    /* JADX INFO: renamed from: a */
    public final C3413a f54512a;

    public C3415c(C3413a c3413a) {
        this.f54512a = c3413a;
    }

    /* JADX INFO: renamed from: b */
    public static List m18069b(String str) {
        List listM23366B0 = vk9.m23366B0(str, new char[]{'.'});
        return fa4.m11650l(u91.m22597O0(listM23366B0), "") ? u91.m22585C0(listM23366B0) : listM23366B0;
    }

    /* JADX INFO: renamed from: a */
    public final String m18070a(String str) {
        String strM18068a;
        String strM18068a2;
        String strM18068a3;
        List listM23366B0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listM18069b = m18069b(unicode);
        C3413a c3413a = this.f54512a;
        c3413a.m18064a();
        int size3 = listM18069b.size();
        ByteString[] byteStringArr = new ByteString[size3];
        for (int i = 0; i < size3; i++) {
            ByteString byteString = ByteString.f54513d;
            byteStringArr[i] = iy5.m14193h((String) listM18069b.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strM18068a = null;
                break;
            }
            strM18068a = C3414b.m18068a(c3413a.m18065b(), byteStringArr, i2);
            if (strM18068a != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strM18068a2 = null;
            break;
        }
        ByteString[] byteStringArr2 = (ByteString[]) byteStringArr.clone();
        int length = byteStringArr2.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strM18068a2 = null;
                break;
            }
            byteStringArr2[i3] = f54509b;
            strM18068a2 = C3414b.m18068a(c3413a.m18065b(), byteStringArr2, i3);
            if (strM18068a2 != null) {
                break;
            }
            i3++;
        }
        if (strM18068a2 == null) {
            strM18068a3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strM18068a3 = null;
                break;
            }
            strM18068a3 = C3414b.m18068a(c3413a.m18066c(), byteStringArr, i5);
            if (strM18068a3 != null) {
                break;
            }
            i5++;
        }
        if (strM18068a3 != null) {
            listM23366B0 = vk9.m23366B0("!".concat(strM18068a3), new char[]{'.'});
        } else if (strM18068a == null && strM18068a2 == null) {
            listM23366B0 = f54510c;
        } else {
            EmptyList emptyList = EmptyList.f47638a;
            List listM23366B1 = strM18068a != null ? vk9.m23366B0(strM18068a, new char[]{'.'}) : emptyList;
            listM23366B0 = strM18068a2 != null ? vk9.m23366B0(strM18068a2, new char[]{'.'}) : emptyList;
            if (listM23366B1.size() > listM23366B0.size()) {
                listM23366B0 = listM23366B1;
            }
        }
        if (listM18069b.size() == listM23366B0.size() && ((String) listM23366B0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM23366B0.get(0)).charAt(0) == '!') {
            size = listM18069b.size();
            size2 = listM23366B0.size();
        } else {
            size = listM18069b.size();
            size2 = listM23366B0.size() + 1;
        }
        int i6 = size - size2;
        ux8 z91Var = new z91(m18069b(str), 0);
        if (i6 < 0) {
            C3386nv.m17624j(ux5.m22989l("Requested element count ", i6, " is less than zero."));
            return null;
        }
        if (i6 != 0) {
            z91Var = z91Var instanceof vm2 ? ((vm2) z91Var).mo19393a(i6) : new pm2(z91Var, i6);
        }
        return AbstractC3204c.m15419o0(z91Var, ".");
    }
}
