package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class w5b extends v5b {
    public w5b(f6b f6bVar, WindowInsets windowInsets) {
        super(f6bVar, windowInsets);
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: a */
    public f6b mo4360a() {
        return f6b.m11570g(null, this.f63458c.consumeDisplayCutout());
    }

    @Override // p000.u5b, p000.c6b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5b)) {
            return false;
        }
        w5b w5bVar = (w5b) obj;
        return Objects.equals(this.f63458c, w5bVar.f63458c) && Objects.equals(this.f63462g, w5bVar.f63462g) && u5b.m22490L(this.f63463h, w5bVar.f63463h);
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: h */
    public rh2 mo4365h() {
        DisplayCutout displayCutout = this.f63458c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new rh2(displayCutout);
    }

    @Override // p000.c6b
    public int hashCode() {
        return this.f63458c.hashCode();
    }

    public w5b(f6b f6bVar, w5b w5bVar) {
        super(f6bVar, w5bVar);
    }
}
