package tl;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.collections.builders.MapBuilder;
import p100em.InterfaceC5430b;
import p165i0.C6113f;
import p165i0.C6119l;

/* JADX INFO: renamed from: tl.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9314b<E> extends AbstractCollection<E> implements Collection<E>, InterfaceC5430b {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C6119l c6119l = (C6119l) this;
        Object obj = c6119l.f35945b;
        switch (c6119l.f35944a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C6113f c6113f = (C6113f) obj;
                c6113f.getClass();
                return c6113f.f35935f;
            default:
                return ((MapBuilder) obj).f38065h;
        }
    }
}
