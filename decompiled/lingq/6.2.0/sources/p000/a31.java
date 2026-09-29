package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class a31 {

    /* JADX INFO: renamed from: a */
    public final String f163a;

    /* JADX INFO: renamed from: b */
    public List f164b = EmptyList.f47638a;

    /* JADX INFO: renamed from: c */
    public final ArrayList f165c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashSet f166d = new HashSet();

    /* JADX INFO: renamed from: e */
    public final ArrayList f167e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f168f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f169g = new ArrayList();

    public a31(String str) {
        this.f163a = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m56a(String str, SerialDescriptor serialDescriptor) {
        str.getClass();
        serialDescriptor.getClass();
        if (!this.f166d.add(str)) {
            StringBuilder sbM17742q = AbstractC3393o1.m17742q("Element with name '", str, "' is already registered in ");
            sbM17742q.append(this.f163a);
            throw new IllegalArgumentException(sbM17742q.toString().toString());
        }
        this.f165c.add(str);
        this.f167e.add(serialDescriptor);
        this.f168f.add(EmptyList.f47638a);
        this.f169g.add(Boolean.FALSE);
    }
}
