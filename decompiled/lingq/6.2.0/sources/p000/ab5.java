package p000;

import com.lingq.core.domain.model.library.LibraryShelf;

/* JADX INFO: loaded from: classes.dex */
public final class ab5 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f458a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b85 f459b;

    public /* synthetic */ ab5(b85 b85Var, int i) {
        this.f458a = i;
        this.f459b = b85Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f458a;
        xfa xfaVar = xfa.f68157a;
        b85 b85Var = this.f459b;
        switch (i) {
            case 0:
                LibraryShelf libraryShelf = (LibraryShelf) obj;
                libraryShelf.getClass();
                b85Var.mo3468u(libraryShelf);
                break;
            default:
                LibraryShelf libraryShelf2 = (LibraryShelf) obj;
                libraryShelf2.getClass();
                b85Var.mo3458k(libraryShelf2);
                break;
        }
        return xfaVar;
    }
}
