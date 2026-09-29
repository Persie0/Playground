package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.common.collect.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3190i {

    /* JADX INFO: renamed from: a */
    public static final a f16159a = new a();

    /* JADX INFO: renamed from: b */
    public static final b f16160b = new b(-1);

    /* JADX INFO: renamed from: c */
    public static final b f16161c = new b(1);

    /* JADX INFO: renamed from: com.google.common.collect.i$a */
    public class a extends AbstractC3190i {
        /* JADX INFO: renamed from: f */
        public static AbstractC3190i m9135f(int i10) {
            if (i10 < 0) {
                return AbstractC3190i.f16160b;
            }
            return i10 > 0 ? AbstractC3190i.f16161c : AbstractC3190i.f16159a;
        }

        @Override // com.google.common.collect.AbstractC3190i
        /* JADX INFO: renamed from: a */
        public final AbstractC3190i mo9130a(int i10, int i11) {
            int i12;
            if (i10 < i11) {
                i12 = -1;
            } else {
                i12 = i10 > i11 ? 1 : 0;
            }
            return m9135f(i12);
        }

        @Override // com.google.common.collect.AbstractC3190i
        /* JADX INFO: renamed from: b */
        public final <T> AbstractC3190i mo9131b(T t10, T t11, Comparator<T> comparator) {
            return m9135f(comparator.compare(t10, t11));
        }

        @Override // com.google.common.collect.AbstractC3190i
        /* JADX INFO: renamed from: c */
        public final AbstractC3190i mo9132c(boolean z10, boolean z11) {
            int i10;
            if (z10 == z11) {
                i10 = 0;
            } else {
                i10 = z10 ? 1 : -1;
            }
            return m9135f(i10);
        }

        @Override // com.google.common.collect.AbstractC3190i
        /* JADX INFO: renamed from: d */
        public final AbstractC3190i mo9133d(boolean z10, boolean z11) {
            int i10;
            if (z11 == z10) {
                i10 = 0;
            } else {
                i10 = z11 ? 1 : -1;
            }
            return m9135f(i10);
        }

        @Override // com.google.common.collect.AbstractC3190i
        /* JADX INFO: renamed from: e */
        public final int mo9134e() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.i$b */
    public static final class b extends AbstractC3190i {

        /* JADX INFO: renamed from: d */
        public final int f16162d;

        public b(int i10) {
            this.f16162d = i10;
        }

        @Override // com.google.common.collect.AbstractC3190i
        /* JADX INFO: renamed from: a */
        public final AbstractC3190i mo9130a(int i10, int i11) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC3190i
        /* JADX INFO: renamed from: b */
        public final <T> AbstractC3190i mo9131b(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC3190i
        /* JADX INFO: renamed from: c */
        public final AbstractC3190i mo9132c(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC3190i
        /* JADX INFO: renamed from: d */
        public final AbstractC3190i mo9133d(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC3190i
        /* JADX INFO: renamed from: e */
        public final int mo9134e() {
            return this.f16162d;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC3190i mo9130a(int i10, int i11);

    /* JADX INFO: renamed from: b */
    public abstract <T> AbstractC3190i mo9131b(T t10, T t11, Comparator<T> comparator);

    /* JADX INFO: renamed from: c */
    public abstract AbstractC3190i mo9132c(boolean z10, boolean z11);

    /* JADX INFO: renamed from: d */
    public abstract AbstractC3190i mo9133d(boolean z10, boolean z11);

    /* JADX INFO: renamed from: e */
    public abstract int mo9134e();
}
