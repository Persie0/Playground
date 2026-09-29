package p000;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class g13 extends i13 {

    /* JADX INFO: renamed from: b */
    public final long f40045b;

    /* JADX INFO: renamed from: c */
    public final long f40046c;

    /* JADX INFO: renamed from: d */
    public final boolean f40047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g13(List list, long j, long j2, boolean z) {
        super(list);
        list.getClass();
        this.f40045b = j;
        this.f40046c = j2;
        this.f40047d = z;
    }

    @Override // p000.i13
    /* JADX INFO: renamed from: a */
    public final i13 mo12278a(eg7 eg7Var) {
        ListBuilder listBuilderM23650t = vz1.m23650t();
        List list = this.f43327a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            listBuilderM23650t.add(((yr1) list.get(i)).m25290c(eg7Var));
        }
        return new g13(vz1.m23635i(listBuilderM23650t), do7.m10523J(this.f40045b, eg7Var), do7.m10523J(this.f40046c, eg7Var), this.f40047d);
    }

    public final String toString() {
        return "Corner: vertex=" + ((Object) i73.m13711b(this.f40045b)) + ", center=" + ((Object) i73.m13711b(this.f40046c)) + ", convex=" + this.f40047d;
    }
}
