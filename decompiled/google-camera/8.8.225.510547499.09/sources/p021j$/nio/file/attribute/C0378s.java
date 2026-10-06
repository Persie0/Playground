package p021j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;
import p021j$.nio.file.AbstractC0335a;

/* JADX INFO: renamed from: j$.nio.file.attribute.s */
/* JADX INFO: loaded from: classes3.dex */
final class C0378s implements FileAttribute {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FileAttribute f32867a;

    C0378s(FileAttribute fileAttribute) {
        this.f32867a = fileAttribute;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(AbstractC0335a.m12115n((Set) this.f32867a.value()));
    }
}
