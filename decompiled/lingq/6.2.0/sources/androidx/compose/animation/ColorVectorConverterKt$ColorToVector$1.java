package androidx.compose.animation;

import kotlin.jvm.internal.Lambda;
import p000.C3044gn;
import p000.aa1;
import p000.d32;
import p000.jda;
import p000.sa1;
import p000.va1;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final ColorVectorConverterKt$ColorToVector$1 f1409b = new ColorVectorConverterKt$ColorToVector$1(1);

    /* JADX INFO: renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1 */
    final class C00501 extends Lambda implements vi3 {

        /* JADX INFO: renamed from: b */
        public static final C00501 f1410b = new C00501(1);

        @Override // p000.vi3
        public final Object invoke(Object obj) {
            long jM197a = aa1.m197a(((aa1) obj).f414a, va1.f65119x);
            return new C3044gn(aa1.m200d(jM197a), aa1.m204h(jM197a), aa1.m203g(jM197a), aa1.m201e(jM197a));
        }
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        final sa1 sa1Var = (sa1) obj;
        return new jda(C00501.f1410b, new vi3() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj2) {
                C3044gn c3044gn = (C3044gn) obj2;
                float f = c3044gn.f41034b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = c3044gn.f41035c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = c3044gn.f41036d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = c3044gn.f41033a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new aa1(aa1.m197a(d32.m10033d(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, va1.f65119x), sa1Var));
            }
        });
    }
}
