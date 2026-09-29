package p151ha;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ha.e */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5948e {

    /* JADX INFO: renamed from: a */
    public static final a f35406a = new a();

    /* JADX INFO: renamed from: ha.e$a */
    public class a implements InterfaceC5948e {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p151ha.InterfaceC5948e
        /* JADX INFO: renamed from: a */
        public final long mo12383a() {
            throw new NoSuchElementException();
        }

        @Override // p151ha.InterfaceC5948e
        /* JADX INFO: renamed from: b */
        public final long mo12384b() {
            throw new NoSuchElementException();
        }

        @Override // p151ha.InterfaceC5948e
        public final boolean next() {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    long mo12383a();

    /* JADX INFO: renamed from: b */
    long mo12384b();

    boolean next();
}
