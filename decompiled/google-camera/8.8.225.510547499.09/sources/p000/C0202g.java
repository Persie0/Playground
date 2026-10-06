package p000;

import java.io.InvalidObjectException;
import java.text.Format;

/* JADX INFO: renamed from: g */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0202g extends Format.Field {

    /* JADX INFO: renamed from: a */
    public static final C0202g f24010a = new C0202g();
    private static final long serialVersionUID = 7510380454602616157L;

    protected C0202g() {
        super("message argument field");
    }

    @Override // java.text.AttributedCharacterIterator.Attribute
    protected Object readResolve() throws InvalidObjectException {
        if (getClass() != C0202g.class) {
            throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
        }
        String name = getName();
        C0202g c0202g = f24010a;
        if (name.equals(c0202g.getName())) {
            return c0202g;
        }
        throw new InvalidObjectException("Unknown attribute name.");
    }
}
