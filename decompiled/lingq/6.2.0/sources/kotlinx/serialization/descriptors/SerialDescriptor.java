package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.collections.EmptyList;
import p000.AbstractC3184kh;

/* JADX INFO: loaded from: classes.dex */
public interface SerialDescriptor {
    /* JADX INFO: renamed from: a */
    String mo3694a();

    /* JADX INFO: renamed from: c */
    default boolean mo11826c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    int mo3696d(String str);

    /* JADX INFO: renamed from: e */
    int mo3697e();

    /* JADX INFO: renamed from: f */
    String mo3698f(int i);

    /* JADX INFO: renamed from: g */
    default boolean mo10855g() {
        return false;
    }

    default List getAnnotations() {
        return EmptyList.f47638a;
    }

    AbstractC3184kh getKind();

    /* JADX INFO: renamed from: h */
    List mo3699h(int i);

    /* JADX INFO: renamed from: i */
    SerialDescriptor mo3700i(int i);

    /* JADX INFO: renamed from: j */
    boolean mo3701j(int i);
}
