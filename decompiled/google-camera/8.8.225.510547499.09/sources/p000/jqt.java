package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jqt extends jgn implements jel {

    /* JADX INFO: renamed from: b */
    private final Status f34603b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f34604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqt(DataHolder dataHolder, int i, byte[] bArr) {
        super(dataHolder);
        this.f34604c = i;
        this.f34603b = new Status(dataHolder.f7630e);
    }

    @Override // p000.jel
    /* JADX INFO: renamed from: a */
    public final Status mo4644a() {
        switch (this.f34604c) {
            case 0:
                break;
        }
        return this.f34603b;
    }

    @Override // p000.jgn
    /* JADX INFO: renamed from: f */
    protected final String mo13141f() {
        int i = this.f34604c;
        return "path";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqt(DataHolder dataHolder, int i) {
        super(dataHolder);
        this.f34604c = i;
        this.f34603b = new Status(dataHolder.f7630e);
    }

    @Override // p000.jgn
    /* JADX INFO: renamed from: e */
    protected final /* synthetic */ Object mo13140e(int i, int i2) {
        switch (this.f34604c) {
            case 0:
                return new jsb(this.f33965a, i, i2);
            default:
                return new jrz(this.f33965a, i, i2);
        }
    }
}
