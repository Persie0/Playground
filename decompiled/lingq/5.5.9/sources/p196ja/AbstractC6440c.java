package p196ja;

import java.util.Collections;
import java.util.List;
import p114fa.InterfaceC5483a;

/* JADX INFO: renamed from: ja.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6440c implements InterfaceC5483a<AbstractC6440c> {

    /* JADX INFO: renamed from: a */
    public final String f36989a;

    /* JADX INFO: renamed from: b */
    public final List<String> f36990b;

    /* JADX INFO: renamed from: c */
    public final boolean f36991c;

    public AbstractC6440c(String str, List<String> list, boolean z10) {
        this.f36989a = str;
        this.f36990b = Collections.unmodifiableList(list);
        this.f36991c = z10;
    }
}
