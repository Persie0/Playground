package androidx.datastore.core;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class DirectBootUsageException extends IOException {
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectBootUsageException(Exception exc) {
        super(exc);
        exc.getClass();
        this.message = "Encountered a [" + exc.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
