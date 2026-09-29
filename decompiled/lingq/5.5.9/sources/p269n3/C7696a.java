package p269n3;

import android.widget.EditText;

/* JADX INFO: renamed from: n3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7696a {

    /* JADX INFO: renamed from: a */
    public final a f42205a;

    /* JADX INFO: renamed from: n3.a$a */
    public static class a extends b {

        /* JADX INFO: renamed from: a */
        public final EditText f42206a;

        /* JADX INFO: renamed from: b */
        public final C7702g f42207b;

        public a(EditText editText) {
            this.f42206a = editText;
            C7702g c7702g = new C7702g(editText);
            this.f42207b = c7702g;
            editText.addTextChangedListener(c7702g);
            if (C7697b.f42209b == null) {
                synchronized (C7697b.f42208a) {
                    if (C7697b.f42209b == null) {
                        C7697b.f42209b = new C7697b();
                    }
                }
            }
            editText.setEditableFactory(C7697b.f42209b);
        }
    }

    /* JADX INFO: renamed from: n3.a$b */
    public static class b {
    }

    public C7696a(EditText editText) {
        if (editText == null) {
            throw new NullPointerException("editText cannot be null");
        }
        this.f42205a = new a(editText);
    }
}
