package p088e7;

import java.util.ArrayList;

/* JADX INFO: renamed from: e7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5383c {

    /* JADX INFO: renamed from: b */
    public static final Object f33800b = new Object();

    /* JADX INFO: renamed from: a */
    public ArrayList<C5382b> f33801a = new ArrayList<>();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final C5382b m11555a() {
        C5382b c5382bRemove;
        synchronized (f33800b) {
            c5382bRemove = null;
            try {
                if (!this.f33801a.isEmpty()) {
                    c5382bRemove = this.f33801a.remove(0);
                }
            } catch (Exception unused) {
            }
        }
        return c5382bRemove;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m11556b(C5382b c5382b) {
        synchronized (f33800b) {
            try {
                int size = this.f33801a.size();
                if (size > 50) {
                    ArrayList<C5382b> arrayList = new ArrayList<>();
                    for (int i10 = 10; i10 < size; i10++) {
                        arrayList.add(this.f33801a.get(i10));
                    }
                    arrayList.add(c5382b);
                    this.f33801a = arrayList;
                } else {
                    this.f33801a.add(c5382b);
                }
            } catch (Exception unused) {
            }
        }
    }
}
