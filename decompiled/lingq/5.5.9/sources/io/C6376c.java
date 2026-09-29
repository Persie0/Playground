package io;

import dm.C5207g;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractC6743a;
import kotlin.collections.C6744b;

/* JADX INFO: renamed from: io.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6376c<T> extends AbstractC6375b<T> {

    /* JADX INFO: renamed from: a */
    public Object[] f36775a = new Object[20];

    /* JADX INFO: renamed from: b */
    public int f36776b = 0;

    /* JADX INFO: renamed from: io.c$a */
    public static final class a extends AbstractC6743a<T> {

        /* JADX INFO: renamed from: c */
        public int f36777c = -1;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C6376c<T> f36778d;

        public a(C6376c<T> c6376c) {
            this.f36778d = c6376c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractC6743a
        /* JADX INFO: renamed from: a */
        public final void mo13008a() {
            int i10;
            Object[] objArr;
            do {
                i10 = this.f36777c + 1;
                this.f36777c = i10;
                objArr = this.f36778d.f36775a;
                if (i10 >= objArr.length) {
                    break;
                }
            } while (objArr[i10] == null);
            if (i10 >= objArr.length) {
                m13374b();
                return;
            }
            Object obj = objArr[i10];
            C5207g.m11109d(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            m13375c(obj);
        }
    }

    @Override // io.AbstractC6375b
    /* JADX INFO: renamed from: a */
    public final int mo13006a() {
        return this.f36776b;
    }

    @Override // io.AbstractC6375b
    /* JADX INFO: renamed from: f */
    public final void mo13007f(int i10, T t10) {
        C5207g.m11111f(t10, "value");
        Object[] objArr = this.f36775a;
        if (objArr.length <= i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
            this.f36775a = objArrCopyOf;
        }
        Object[] objArr2 = this.f36775a;
        if (objArr2[i10] == null) {
            this.f36776b++;
        }
        objArr2[i10] = t10;
    }

    @Override // io.AbstractC6375b
    public final T get(int i10) {
        return (T) C6744b.m13383o0(i10, this.f36775a);
    }

    @Override // io.AbstractC6375b, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
