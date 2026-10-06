package p000;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class brq extends brm {

    /* JADX INFO: renamed from: a */
    private static final UriMatcher f4232a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f4232a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public brq(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: renamed from: e */
    private static final InputStream m2958e(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: a */
    public final Class mo2934a() {
        return InputStream.class;
    }

    @Override // p000.brm
    /* JADX INFO: renamed from: b */
    protected final /* bridge */ /* synthetic */ Object mo2935b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM2958e;
        switch (f4232a.match(uri)) {
            case 1:
            case 5:
                Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
                if (uriLookupContact == null) {
                    throw new FileNotFoundException("Contact cannot be found");
                }
                inputStreamM2958e = m2958e(contentResolver, uriLookupContact);
                break;
                break;
            case 2:
            case 4:
            default:
                inputStreamM2958e = contentResolver.openInputStream(uri);
                break;
            case 3:
                inputStreamM2958e = m2958e(contentResolver, uri);
                break;
        }
        if (inputStreamM2958e != null) {
            return inputStreamM2958e;
        }
        throw new FileNotFoundException("InputStream is null for ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // p000.brm
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ void mo2936c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
