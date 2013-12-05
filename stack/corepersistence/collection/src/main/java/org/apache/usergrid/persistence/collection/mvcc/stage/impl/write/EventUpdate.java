package org.apache.usergrid.persistence.collection.mvcc.stage.impl.write;


import org.apache.usergrid.persistence.collection.CollectionContext;
import org.apache.usergrid.persistence.collection.mvcc.stage.CollectionEvent;
import org.apache.usergrid.persistence.collection.mvcc.stage.Result;
import org.apache.usergrid.persistence.model.entity.Entity;


/** @author tnine */
public class EventUpdate extends CollectionEvent<Entity> {

    public EventUpdate( final CollectionContext context, final Entity data, final Result result ) {
        super( context, data, result );
    }
}