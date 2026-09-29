package p141h0;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: h0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5865b extends AbstractC5864a {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f35134c = 0;

    /* JADX INFO: renamed from: d */
    public final Object f35135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5865b(int i10, int i11, Object[] objArr) {
        super(i10, i11);
        C5207g.m11111f(objArr, "buffer");
        this.f35135d = objArr;
    }

    public C5865b(int i10, Object obj) {
        super(i10, 1);
        this.f35135d = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f35134c;
        Object obj = this.f35135d;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.f35132a;
                this.f35132a = i11 + 1;
                return ((Object[]) obj)[i11];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f35132a++;
                return obj;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f35134c;
        Object obj = this.f35135d;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.f35132a - 1;
                this.f35132a = i11;
                return ((Object[]) obj)[i11];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f35132a--;
                return obj;
        }
    }
}
