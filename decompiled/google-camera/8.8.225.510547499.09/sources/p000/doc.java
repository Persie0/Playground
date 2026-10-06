package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class doc extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final List f12151a;

    /* JADX INFO: renamed from: b */
    public final kcl f12152b;

    public doc(String str, kcl kclVar, kmq... kmqVarArr) {
        super(str);
        this.f12151a = Arrays.asList(kmqVarArr);
        this.f12152b = kclVar;
    }
}
