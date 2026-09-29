package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.C3386nv;
import p000.ck7;
import p000.jw4;
import p000.p94;
import p000.xm8;

/* JADX INFO: renamed from: com.google.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1180a {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: g */
    public static void m6789g(Iterable iterable, List list) {
        Charset charset = p94.f55800a;
        iterable.getClass();
        if (iterable instanceof jw4) {
            List underlyingElements = ((jw4) iterable).getUnderlyingElements();
            jw4 jw4Var = (jw4) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (jw4Var.size() - size) + " is null.";
                    for (int size2 = jw4Var.size() - 1; size2 >= size; size2--) {
                        jw4Var.remove(size2);
                    }
                    C3386nv.m17635v(str);
                    return;
                }
                if (obj instanceof ByteString) {
                    jw4Var.mo6818u((ByteString) obj);
                } else {
                    jw4Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof ck7) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                C3386nv.m17635v(str2);
                return;
            }
            list.add(obj2);
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo6790h(xm8 xm8Var);

    /* JADX INFO: renamed from: i */
    public abstract void mo6791i(C1181b c1181b);
}
