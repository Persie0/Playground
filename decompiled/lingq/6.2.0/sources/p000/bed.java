package p000;

import com.lingq.core.token.TokenFragmentData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bed {
    /* JADX INFO: renamed from: a */
    public static final TokenFragmentData m3675a(ArrayList arrayList, List list, String str, boolean z) {
        if (list.isEmpty() || arrayList.isEmpty() || str.length() == 0) {
            return new TokenFragmentData();
        }
        try {
            xz7 xz7Var = (xz7) u91.m22589G0(list);
            xz7 xz7Var2 = (xz7) u91.m22597O0(list);
            int i = xz7Var.f69011h;
            int i2 = xz7Var2.f69011h;
            int i3 = i - 5;
            if (i3 <= 0) {
                i3 = 0;
            }
            int size = arrayList.size() - 1;
            int i4 = i2 + 3;
            if (size > i4) {
                size = i4;
            }
            if (i3 >= 0 && i3 < size && size < arrayList.size()) {
                StringBuilder sb = new StringBuilder();
                int i5 = ((xz7) arrayList.get(i3)).f69006c;
                int i6 = ((xz7) arrayList.get(size)).f69007d;
                if (i5 >= 0 && i5 < i6 && i6 <= str.length()) {
                    sb.append(str.substring(i5, i6));
                }
                if (z) {
                    if (size < arrayList.size() - 1) {
                        sb.insert(0, "...");
                    } else if (size == arrayList.size() - 1 && ((xz7) arrayList.get(size)).f69007d < str.length()) {
                        sb.append(str.substring(((xz7) arrayList.get(size)).f69007d, str.length()));
                    }
                    if (i3 > 0) {
                        sb.append("...");
                    }
                } else {
                    if (i3 > 0) {
                        sb.insert(0, "...");
                    }
                    if (size < arrayList.size() - 1) {
                        sb.append("...");
                    } else if (size == arrayList.size() - 1 && ((xz7) arrayList.get(size)).f69007d < str.length()) {
                        sb.append(str.substring(((xz7) arrayList.get(size)).f69007d, str.length()));
                    }
                }
                return new TokenFragmentData(vk9.m23376L0(sb.toString()).toString(), i);
            }
            return new TokenFragmentData();
        } catch (Exception e) {
            sm5.Companion.getClass();
            h0a.f41641a.mo11432c(e);
            return new TokenFragmentData();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m3676b(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(m9c.f50823a);
        int length = bytes.length;
        if (length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, length);
        return i + length;
    }
}
