package p000;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class h13 extends i13 {
    @Override // p000.i13
    /* JADX INFO: renamed from: a */
    public final i13 mo12278a(eg7 eg7Var) {
        ListBuilder listBuilderM23650t = vz1.m23650t();
        List list = this.f43327a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            listBuilderM23650t.add(((yr1) list.get(i)).m25290c(eg7Var));
        }
        ListBuilder listBuilderM23635i = vz1.m23635i(listBuilderM23650t);
        listBuilderM23635i.getClass();
        return new h13(listBuilderM23635i);
    }

    public final String toString() {
        return "Edge";
    }
}
